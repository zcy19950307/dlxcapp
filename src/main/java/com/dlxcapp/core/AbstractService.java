package com.dlxcapp.core;


import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

import javax.persistence.Column;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<T> implements Service<T> {

    @Autowired
    protected Mapper<T> mapper;

    private Class<T> modelClass;    // 当前泛型真实类型的Class

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    public void save(T model) {
        mapper.insertSelective(model);
    }
    
    public void save(List<T> models) {
        mapper.insertList(models);
    }

    public void deleteById(Object id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void deleteByIds(String ids) {
        mapper.deleteByIds(ids);
    }

    public void update(T model) {
        mapper.updateByPrimaryKeySelective(model);
    }

    public T findById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }
    
    @Override
    public T findBy(String fieldName, Object value) throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    public List<T> findAll() {
        return mapper.selectAll();
    }
    public List<T>  findListByModel(T model){
    	return findListByModel(model,null,null);
    }

    public List<T>  findListByModel(T model,String likeName){
    	return findListByModel(model,likeName,null);
    }

    public List<T>  findListByModel(T model,String likeName,String orderByClause){
    	Condition condition=new Condition(model.getClass());
    	Criteria criteria = condition.createCriteria();//.andCondition("role_name like '%"+role.getRoleName()+"%'");
        Field[] fields =model.getClass().getDeclaredFields();  
        for(Field field : fields){  
        	field.setAccessible(true); 
            boolean fieldHasAnno = field.isAnnotationPresent(Column.class);
            String annoName=null,properName=null; Object value=null;
            if(fieldHasAnno){  
            	Column fieldAnno = field.getAnnotation(Column.class); 
            	annoName = fieldAnno.name();
             } 
            properName = field.getName();
            try {
				value = field.get(model);
			} catch (Exception e) {
				  throw new ServiceException(e.getMessage(), e);
			} 
            
            if(value!=null){
            	String name = annoName == null?properName:annoName;
          
            	if(likeName!=null && (name.equalsIgnoreCase(likeName) || properName.equalsIgnoreCase(likeName))){
            		criteria.andCondition(""+name+" like '%"+value+"%'");
            	}else{
                	criteria.andCondition(""+name+" = '"+value+"'");
                }
            	
            }     
        }
        if(orderByClause!=null){
        	condition.setOrderByClause(orderByClause);
        }
        return this.findByCondition(condition);
    }
}

package com.dlxcapp.service.impl;

import com.dlxcapp.dao.CityMapper;
import com.dlxcapp.model.City;
import com.dlxcapp.service.CityService;
import com.dlxcapp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/14.
 */
@Service
@Transactional
public class CityServiceImpl extends AbstractService<City> implements CityService {
    @Resource
    private CityMapper myCityMapper;

}

package com.dlxcapp.service.impl;

import com.dlxcapp.dao.AreaMapper;
import com.dlxcapp.model.Area;
import com.dlxcapp.service.AreaService;
import com.dlxcapp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/14.
 */
@Service
@Transactional
public class AreaServiceImpl extends AbstractService<Area> implements AreaService {
    @Resource
    private AreaMapper myAreaMapper;

}

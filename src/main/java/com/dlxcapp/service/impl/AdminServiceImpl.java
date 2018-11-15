package com.dlxcapp.service.impl;

import com.dlxcapp.dao.AdminMapper;
import com.dlxcapp.model.Admin;
import com.dlxcapp.service.AdminService;
import com.dlxcapp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/14.
 */
@Service
@Transactional
public class AdminServiceImpl extends AbstractService<Admin> implements AdminService {
    @Resource
    private AdminMapper myAdminMapper;

}

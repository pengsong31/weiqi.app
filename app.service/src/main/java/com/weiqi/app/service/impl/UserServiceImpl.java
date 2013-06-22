/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.impl;

import org.springframework.stereotype.Service;

import com.weiqi.app.service.bean.UserBean;
import com.weiqi.app.service.intf.UserService;

/**
 * @author darui.wudr 2013-6-22 下午2:05:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean registerUser(UserBean user) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean validateUser(String validateCode) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public UserBean userLogin(String userName, String password) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserBean modifyPassword(String userName, String oldPassword, String newPassword) {
        // TODO Auto-generated method stub
        return null;
    }
}

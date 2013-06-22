/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.intf;

import com.weiqi.app.service.bean.UserBean;

/**
 * user操作接口
 * 
 * @author darui.wudr 2013-6-21 下午7:25:52
 */
public interface UserService {
    /**
     * 注册用户
     * 
     * @param user
     * @return
     */
    boolean registerUser(UserBean user);

    /**
     * 用户注册校验
     * 
     * @param validateCode
     * @return
     */
    boolean validateUser(String validateCode);

    /**
     * 用户登录
     * 
     * @param userName
     * @param password
     * @return
     */
    UserBean userLogin(String userName, String password);

    /**
     * 更改密码
     * 
     * @param userName
     * @param oldPassword
     * @param newPassword
     * @return
     */
    UserBean modifyPassword(String userName, String oldPassword, String newPassword);
}

/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.intf;

import java.util.List;

import com.weiqi.app.service.bean.MenuBean;

/**
 * 类名API
 * 
 * @author darui.wudr 2013-6-22 下午12:20:28
 */
public interface MenuServiceApi {
    /**
     * 查找菜单项的子菜单列表
     * 
     * @param parentID if = null,查找一级菜单列表
     * @return
     */
    List<MenuBean> findMenusByParent(Long parentID);
}

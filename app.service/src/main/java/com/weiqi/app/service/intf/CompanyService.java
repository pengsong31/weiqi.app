/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.intf;

import com.weiqi.app.service.bean.CompanyBean;

/**
 * @author darui.wudr 2013-6-22 下午12:23:54
 */
public interface CompanyService {
    /**
     * 根据appID查找企业信息
     * 
     * @param appUUID 28位的全球唯一的UUID
     * @return
     */
    CompanyBean findBussinessByApp(long appID);

    /**
     * 根据UUID查找对应的appID
     * 
     * @param appUUID
     * @return
     */
    Long findAppIDByUUID(String appUUID);
}

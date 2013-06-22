/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.dao.intf;

import com.weiqi.app.dto.CompanyDto;

/**
 * @author darui.wudr 2013-6-22 下午3:38:05
 */
public interface CompanyDao {
    CompanyDto findCompanyDtoByID(long appID);
}

/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.web.appurl;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.weiqi.app.service.bean.CompanyBean;
import com.weiqi.app.web.annotation.Page;

/**
 * @author darui.wudr 2013-6-22 下午1:42:14
 */
@Page("/app/page")
public class CompanyPage extends BaseAppPage {
    private static final long serialVersionUID = 7398110058621141539L;

    public CompanyPage(PageParameters paras) {
        super(paras);
    }

    @Override
    protected Object doProcess(PageParameters paras) {
        long appID = super.getAppID(paras);
        CompanyBean bean = this.companyService.findBussinessByApp(appID);
        return bean;
    }
}

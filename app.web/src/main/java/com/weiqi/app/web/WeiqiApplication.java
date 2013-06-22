/*
 * Copyright 2012 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.web;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import com.weiqi.app.web.annotation.PageScanner;
import com.weiqi.app.web.appurl.CompanyPage;

/**
 * @author darui.wudr 2012-12-29 下午8:32:29
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class WeiqiApplication extends WebApplication {
    private static Log log = LogFactory.getLog(WeiqiApplication.class);

    @Override
    public Class<? extends Page> getHomePage() {
        return CompanyPage.class;
    }

    @Override
    public void init() {
        super.init();
        this.getComponentInstantiationListeners().add(new SpringComponentInjector(this));
        this.mount();
    }

    @Override
    public RuntimeConfigurationType getConfigurationType() {
        //        return RuntimeConfigurationType.DEPLOYMENT;
        return RuntimeConfigurationType.DEVELOPMENT;
    }

    /**
     * url mount
     */
    protected void mount() {
        try {
            Map<String, Class> pages = PageScanner.scanPage();
            for (Map.Entry<String, Class> entry : pages.entrySet()) {
                super.mountPage(entry.getKey(), entry.getValue());
                log.info("\n mount {'page':'" + entry.getKey() + "',\n\t'claz':'" + entry.getValue().getName() + "'}");
            }
        } catch (ClassNotFoundException e) {
            String err = "mount page error:" + e.getMessage();
            log.error(err, e);
            throw new RuntimeException(err, e);
        }
        //this.mountPage("/app/page", CompanyPage.class);
    }
}

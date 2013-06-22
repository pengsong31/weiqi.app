/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.web.appurl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.IRequestCycle;
import org.apache.wicket.request.IRequestHandler;
import org.apache.wicket.request.http.WebResponse;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.alibaba.fastjson.JSON;
import com.weiqi.app.service.intf.CompanyService;
import com.weiqi.app.web.annotation.Page;

/**
 * @author darui.wudr 2013-6-22 下午1:10:05
 */
public abstract class BaseAppPage extends WebPage {// implements IMarkupResourceStreamProvider
    private static final long serialVersionUID = -521887324367928854L;

    private static Log        log              = LogFactory.getLog(BaseAppPage.class);

    final static String       APP_UUID         = "appuuid";

    @SpringBean
    protected CompanyService  companyService;

    public BaseAppPage(final PageParameters paras) {
        IRequestHandler handler = new AppRequestHandler() {
            @Override
            protected String process() {
                Object bean = doProcess(paras);
                String json = toJson(bean);
                log.info("\nurl " + getURL() + " json:\n\t" + json);
                return json;
            }
        };
        this.getRequestCycle().scheduleRequestHandlerAfterCurrent(handler);
    }

    /**
     * 根据url参数查询相应的结果（bean）
     * 
     * @param paras
     * @return
     */
    protected abstract Object doProcess(final PageParameters paras);

    protected long getAppID(PageParameters paras) {
        String appUUID = paras.get(APP_UUID).toString();
        Long appID = companyService.findAppIDByUUID(appUUID);
        return appID == null ? 0L : appID;
    }

    private final static String toJson(Object obj) {
        String json = JSON.toJSONString(obj);
        return json;
    }

    private String pageUrl = null;

    private String getURL() {
        if (pageUrl == null) {
            Page page = this.getClass().getAnnotation(Page.class);
            this.pageUrl = page == null ? "app/unknown" : page.value();
        }
        return pageUrl;
    }
}

abstract class AppRequestHandler implements IRequestHandler {
    @Override
    public void respond(IRequestCycle requestCycle) {
    }

    @Override
    public void detach(IRequestCycle requestCycle) {
        WebResponse response = (WebResponse) requestCycle.getResponse();
        response.setContentType("application/json; charset=UTF-8");
        response.addHeader("Content-Type", "application/json; charset=UTF-8");
        String json = this.process();
        response.write(json);
    }

    protected abstract String process();
}

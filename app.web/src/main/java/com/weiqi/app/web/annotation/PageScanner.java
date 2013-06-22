/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.web.annotation;

import java.util.HashMap;
import java.util.Map;

import org.apache.wicket.markup.html.WebPage;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * 扫描页面配置的url
 * 
 * @author darui.wudr 2013-6-22 下午4:11:44
 */
@SuppressWarnings({ "rawtypes" })
public class PageScanner {
    private final static String BASE_APP_WEB_URL = "com.weiqi.app.web";

    public static Map<String, Class> scanPage() throws ClassNotFoundException {
        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(true);

        scanner.addIncludeFilter(new AnnotationTypeFilter(Page.class));
        Map<String, Class> pages = new HashMap<String, Class>();
        for (BeanDefinition bd : scanner.findCandidateComponents(BASE_APP_WEB_URL)) {
            String clazName = bd.getBeanClassName();
            Class claz = Class.forName(clazName);
            if (!WebPage.class.isAssignableFrom(claz)) {
                continue;
            }
            Page page = Class.forName(clazName).getAnnotation(Page.class);
            if (page == null) {
                continue;
            }
            pages.put(page.value(), claz);
        }
        return pages;
    }
}

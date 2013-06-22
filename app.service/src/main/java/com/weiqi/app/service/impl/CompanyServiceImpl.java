/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.impl;

import org.springframework.stereotype.Service;

import com.weiqi.app.service.bean.CompanyBean;
import com.weiqi.app.service.intf.CompanyService;

/**
 * @author darui.wudr 2013-6-22 下午2:06:42
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    public CompanyBean findBussinessByApp(long appID) {
        CompanyBean bean = new CompanyBean();
        bean.setAppIcon("din.icon");
        bean.setCompanyAddress("杭州滨江网商路699号");
        bean.setCompanyName("阿里巴巴");
        bean.setCompanyTaobao("www.taobao.com");
        bean.setIntroduceDetail("阿里巴巴(1688.com)是全球企业间(B2B)电子商务的著名品牌,为数千万网商提供海量商机信息和便捷安全的在线交易市场,也是商人们以商会友、真实互动的社区平台"
                + "阿里巴巴(1688.com)是全球企业间(B2B)电子商务的著名品牌,为数千万网商提供海量商机信息和便捷安全的在线交易市场,也是商人们以商会友、真实互动的社区平台"
                + "阿里巴巴(1688.com)是全球企业间(B2B)电子商务的著名品牌,为数千万网商提供海量商机信息和便捷安全的在线交易市场,也是商人们以商会友、真实互动的社区平台"
                + "阿里巴巴(1688.com)是全球企业间(B2B)电子商务的著名品牌,为数千万网商提供海量商机信息和便捷安全的在线交易市场,也是商人们以商会友、真实互动的社区平台"
                + "阿里巴巴(1688.com)是全球企业间(B2B)电子商务的著名品牌,为数千万网商提供海量商机信息和便捷安全的在线交易市场,也是商人们以商会友、真实互动的社区平台"
                + "阿里巴巴(1688.com)是全球企业间(B2B)电子商务的著名品牌,为数千万网商提供海量商机信息和便捷安全的在线交易市场,也是商人们以商会友、真实互动的社区平台");
        bean.setIntroduceImage("image/demo1.jpg");
        return bean;
    }

    @Override
    public Long findAppIDByUUID(String appUUID) {
        // TODO Auto-generated method stub
        return 1L;
    }
}

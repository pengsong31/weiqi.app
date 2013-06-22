/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.bean;

import java.io.Serializable;

/**
 * 企业信息
 * 
 * @author darui.wudr 2013-6-22 下午12:22:23
 */
public class CompanyBean implements Serializable {
    private static final long serialVersionUID = -8451000850953617134L;

    private String            companyName;

    private String            appIcon;

    private String            introduceDetail;

    private String            introduceImage;

    private String            companyAddress;

    private String            companyTaobao;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    public String getIntroduceDetail() {
        return introduceDetail;
    }

    public void setIntroduceDetail(String introduceDetail) {
        this.introduceDetail = introduceDetail;
    }

    public String getIntroduceImage() {
        return introduceImage;
    }

    public void setIntroduceImage(String introduceImage) {
        this.introduceImage = introduceImage;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyTaobao() {
        return companyTaobao;
    }

    public void setCompanyTaobao(String companyTaobao) {
        this.companyTaobao = companyTaobao;
    }
}

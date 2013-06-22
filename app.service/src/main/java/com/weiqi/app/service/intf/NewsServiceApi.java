/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.intf;

import java.util.List;

import com.weiqi.app.service.bean.ImageBean;
import com.weiqi.app.service.bean.NewsBean;
import com.weiqi.app.service.bean.PagedBean;

/**
 * 新闻（商品）相关API
 * 
 * @author darui.wudr 2013-6-22 下午12:19:26
 */
public interface NewsServiceApi {
    /**
     * 根据菜单项分页查找新闻
     * 
     * @param menuID
     * @param page
     * @return
     */
    List<NewsBean> findPagedNewsByMenuID(long menuID, PagedBean page);

    /**
     * 新闻详情列表
     * 
     * @param newsID
     * @return
     */
    List<ImageBean> findNewImageList(long newsID);
}

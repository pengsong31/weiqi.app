/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.weiqi.app.service.intf;

import java.io.InputStream;

/**
 * 图片处理url
 * 
 * @author darui.wudr 2013-6-22 下午2:48:04
 */
public interface ImageService {
    /**
     * 读取图片文件流
     * 
     * @param image
     * @return
     */
    InputStream getImageInputStream(String image);
}

package com.starsea.im.web.controller;

import com.starsea.im.aggregation.util.ServiceResult;

/**
 * Created by beigua on 2015/8/5.
 */
public class AjaxBase {
    protected ServiceResult setResponseData(Object msg){
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg(msg);
        return serviceResult;
    }
}

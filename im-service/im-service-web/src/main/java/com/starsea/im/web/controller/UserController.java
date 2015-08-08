package com.starsea.im.web.controller;

import com.starsea.im.aggregation.service.UserService;
import com.starsea.im.aggregation.util.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by beigua on 2015/8/5.
 */
@Controller
@RequestMapping("/user")
public class UserController extends AjaxBase{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public ServiceResult getLeadList(HttpServletRequest request) {
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg(userService.querUsers());
        serviceResult.setCode(200);
        return setResponseData(serviceResult);
    }
}

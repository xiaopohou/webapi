package com.tubugs.springboot.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by xuzhang on 2017/8/23.
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Session getHttpSession() {
        return SecurityUtils.getSubject().getSession();
    }
}
package com.ssm.config;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;




public class AdminInterceptor implements HandlerInterceptor {


        @Override
        public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object handler) throws Exception {
            HttpSession session = httpServletRequest.getSession();

            Map<String,String> user = (Map<String, String>) session.getAttribute("user");

            if (user == null) {
                try {
                    //未登录访问未放行的接口时跳转到登录页面
                    response.sendRedirect("/login.html");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return false;
            }
            return true;

        }


        @Override
        public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        }

        @Override
        public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        }
    }

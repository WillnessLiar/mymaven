package com.ssm.config;





import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class LoginConfig implements WebMvcConfigurer {

        //实现拦截器 要拦截的路径以及不拦截的路径
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            //注册自定义拦截器，添加拦截路径和排除拦截路径

            registry.addInterceptor(new AdminInterceptor()).addPathPatterns("/**").excludePathPatterns(
//                    "/**/dynamic.html",//放行动态
//                    "/selectPhoto",//放行动态接口
                    "/**/login.html",//放行登录页面
                    "/User/login",//放行登录接口
                    "/User/register",//放行注册接口
                    "/**/findex.html",//放行登录页面
                    "/**/error.html",//放行错误页面
                    "/**/css/**",//放行css
                    "/**/images/**",//放行图片
                    "/**/js/**",//放行js
                    "/**/*.woff",
                    "/**/*.woff2",
                    "/**/*.ttf"
            );
        }


}


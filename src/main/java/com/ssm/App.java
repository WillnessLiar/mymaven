//package com.ssm;
//
//
//import com.ssm.filter.SecongFilter;
////import com.ssm.listener.SecondListener;
//import com.ssm.servlet.SecongServlet;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//@MapperScan("com.ssm.mapper")
//public class App {
//
//    public static void main(String[] args) {
//        SpringApplication.run(App.class);
//    }
//
//    //    注册servlet
//    @Bean
//    public ServletRegistrationBean getServletRegistrationBean() {
//        ServletRegistrationBean bean = new ServletRegistrationBean(new SecongServlet());
//        bean.addUrlMappings("/second");
//        return bean;
//    }
//
//    //    注册filter
//    @Bean
//    public FilterRegistrationBean getFilterRegistrationBean() {
//        FilterRegistrationBean bean = new FilterRegistrationBean(new SecongFilter());
////    bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
//        bean.addUrlPatterns("/second");
//        return bean;
//    }
//
////    注册listener
////    @Bean
////    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
////        ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
////        return bean;
////    }
//
//
//}
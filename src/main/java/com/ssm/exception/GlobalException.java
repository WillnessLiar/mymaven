//package com.ssm.exception;
//
////  通过SimpleMappingExceptionResolver做全局异常处理
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Properties;
//
////@ControllerAdvice
//@Configuration
//public class GlobalException implements HandlerExceptionResolver {
//    //    方法三：（最全面、建议使用）通过 HandlerExceptionResolver接口实现全局异常处理
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        ModelAndView mv = new ModelAndView();
//        //判断不同异常类型，做不同视图跳转
//        if(e instanceof ArithmeticException){
//            mv.setViewName("error1");
//        }
//        if(e instanceof NullPointerException){
//            mv.setViewName("error2");
//        }
//        mv.addObject("error", e.toString());
//        return mv;
//    }
//
//////     方法一 ：该方法必须要有返回值。返回值类型必须是：SimpleMappingExceptionResolver，但不显示错误信息到前台
////    @Bean
////    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
////        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
////        Properties mappings = new Properties();
//////         参数一：异常的类型，注意必须是异常类型的全名
//////          参数二：视图名称
////        mappings.put("java.lang.ArithmeticException", "error1");
////        mappings.put("java.lang.NullPointerException","error2");
////        //设置异常与视图映射信息的
////        resolver.setExceptionMappings(mappings);
////        return resolver;
////    }
//
//
////    方法二： java.lang.ArithmeticException
//////    该方法需要返回一个ModelAndView：目的是可以让我们封装异常信息以及视图的指定
//////     参数Exception e:会将产生异常对象注入到方法中
////    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
////    public ModelAndView arithmeticExceptionHandler(Exception e) {
////        ModelAndView mv = new ModelAndView();
////        mv.addObject("error", e.toString());
////        mv.setViewName("error1");
////        return mv;
////    }
////    //    java.lang.NullPointerException
//////    该方法需要返回一个ModelAndView：目的是可以让我们封装异常信息以及视图的指定
//////    参数Exception e:会将产生异常对象注入到方法中
////    @ExceptionHandler(value = {java.lang.NullPointerException.class})
////    public ModelAndView nullPointerExceptionHandler(Exception e) {
////        ModelAndView mv = new ModelAndView();
////        mv.addObject("error", e.toString());
////        mv.setViewName("error2");
////        return mv;
////    }
//}

package com.ssm.controller;


import com.ssm.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Controller
public class DemoController {

    @RequestMapping("/show")
    public String showInfo(Model model) {
        model.addAttribute("msg1", "666DD哈哈ddd");
        model.addAttribute("msg2", new Date());
//        System.out.println("23哈哈哈");
//        错误demo
//        String str = null;
//        str.length();
//        int a=10/0;
        return "thymeleafDemo";
    }

    @RequestMapping("/show/{id}")
    public String showInfo(Model model, @PathVariable("id") Integer id) {
        System.out.println(id);
        model.addAttribute("msg1", "666DD哈哈ddd");
        model.addAttribute("msg2", new Date());
        return "thymeleafDemo";
    }

    @RequestMapping("/show3")
    public String showInfo3(Model model, HttpServletRequest request) {
        model.addAttribute("sex", "男");
        model.addAttribute("id", "66");
        Map<String, User> map = new HashMap<>();
        map.put("u1", new User(1, "接Q辣舞", "111ddd", 19));
        map.put("u2", new User(2, "444", "111ddd", 18));
        map.put("u3", new User(3, "4396", "asd111", 29));
        map.put("u4", new User(4, "洗澡狗", "2800", 19));
        model.addAttribute("map", map);
        request.setAttribute("req", "hello");
        request.getSession().setAttribute("sess", "world");
        request.getSession().getServletContext().setAttribute("app", "!!!");
        return "demo2";
    }





//    @RequestMapping("/{page}")
//    public String shower(@PathVariable String page,Integer id){
//        System.out.println(id);
//        return page;
//    }
}

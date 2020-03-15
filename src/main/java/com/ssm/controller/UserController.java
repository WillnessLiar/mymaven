package com.ssm.controller;

import com.ssm.po.User;
import com.ssm.service.UserService;
import com.ssm.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/info")
//    public String info() {
//        return "info";
//    }
//
////    jsp的静态显示
//    @RequestMapping("/listUser")
//    public String listUser(Model model) {
//        List<User> list = new ArrayList<>();
//        list.add(new User(1, "FAKER", "123456", 15));
//        list.add(new User(2, "UZI", "23456", 45));
//        list.add(new User(3, "4396", "asd", 20));
//        list.add(new User(4, "MLXG", "zxc", 26));
//        model.addAttribute("list", list);
//        return "listUser";
//    }

    //    显示用户
    @RequestMapping("/findUserAll")
    public String findUserAll(Model model) {
        List<User> list = this.userService.findUserAll();
        model.addAttribute("list", list);
        return "demo1";
    }

    //    通过id查找，查询功能
    @RequestMapping("/selectUserById")
    public String selectUserById(Model model, Integer id) {
        User user = this.userService.findUserById(id);
        List<User> list = new ArrayList<>();
        list.add(user);
        model.addAttribute("list", list);
        return "demo1";
    }

    //    进入添加页面
    @RequestMapping("/toaddUser")
    public String toaddUser(User user) {
        return "input";
    }

    //    添加用户
//    @Valid 开启user对象的数据校验,BindingResult 封装校验结果
    @RequestMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "input";
        }
        this.userService.addUser(user);
        System.out.println(user);
        System.out.println(user.toString());
        return "demo1ok";
    }


    //    根据用户id查询用户，修改查询
    @RequestMapping("/findUserById")
    public String findUserById(Integer id, Model model) {
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "updateUser";
    }


    //    更新用户
    @RequestMapping("/editUser")
    public String editUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "updateUser";
        }
        this.userService.updateUser(user);
        return "demo1ok";
    }

    //    删除
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id) {
        this.userService.deleteUserById(id);
        return "redirect:/User/findUserAll";
    }
//    @RequestMapping("/{page}")
//    public String showPage(@PathVariable String page) {
//
//        return page;
//    }
    @ResponseBody
    @PostMapping("/login")
    public R login(@RequestBody Map<String,String> userLogin,HttpSession session) {
        Map<String, Object> user = userService.selectByUsername(userLogin.get("username"));
        if (user==null){
            return R.error("无此帐号,请先注册");
        }else {
            if (!user.get("password").equals(userLogin.get("password"))){

                return R.error("密码错误");
            }else {
                session.setAttribute("user",user);
                return R.ok(user);
            }


}

}

    @ResponseBody
    @GetMapping("/logout")
    public ModelAndView logout(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        session.removeAttribute("user");
        mv.setViewName("redirect:/login.html");
        return mv;
    }
    @ResponseBody
    @PostMapping("/register")
    public R register(@RequestBody Map<String,Object> users) {
        String age = (String) users.get("age");
        try {
            int age_int=Integer.parseInt( age );
        }catch (NumberFormatException e){
            return R.error("年龄必须为数字");
        }
        String name= (String) users.get("name");
        if(name.equals("")){
            return R.error("姓名不能为空");
        }
        String password= (String) users.get("password");

        String username= (String) users.get("username");
        if (username.equals("")){
            return R.error("用户名不能为空");
        }
        if (password.equals("")){
            return R.error("密码不能为空");
        }
        Map<String, Object> user = userService.selectByUsername(username);
        if(user!=null){
            return R.error("帐号已被注册");
        }else {
            users.put("role","1");
            userService.register(users);
            return R.ok();
        }

        }

}

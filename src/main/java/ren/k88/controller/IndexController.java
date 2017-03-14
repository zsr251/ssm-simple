package ren.k88.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ren.k88.entity.User;
import ren.k88.service.UserService;

/**
 * Created by jasonzhu on 2017/3/14.
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String a(){
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/user")
    public User user(){
        return userService.getUser();
    }



}

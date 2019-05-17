package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
@RequestMapping("/")
public class indexController {

    /**
     * 测试thymeleaf
     * 无数据连接
     * 浏览器输入“localhost:8080/thyindex”
     */
    @RequestMapping("/thyindex")
    public String thyIndex(){
        return "thy/thyindex";
    }

    /**
     * 测试thymeleaf
     * 有数据连接
     * 浏览器输入“localhost:8080/thyindex1”
     */
    @RequestMapping("/thyindex1")
    public String thyIndex(ModelMap map){
        map.put("msg", "Hello dalaoyang , this is thymeleaf");
        return "thy/thyindex1";
    }

    /**
     * 测试freemarker
     * 无数据连接
     * 浏览器输入“localhost:8080/hello”
     */
    @RequestMapping("/hello")
    public String index(){
        return "free/hello";
    }

    /**
     * 测试freemarker
     * 有数据连接
     * 浏览器输入“localhost:8080/index”
     */
    @RequestMapping("/index")
    public String index(ModelMap map){
        map.put("user", "皮卡丘");
        map.put("sex", 1);
        List<Object> userList = new ArrayList<Object>();
        userList.add("后方可扩散");
        userList.add("法撒旦高");
        userList.add("厦股份给单方");
        map.put("userList", userList);
        return "free/index";
    }





}

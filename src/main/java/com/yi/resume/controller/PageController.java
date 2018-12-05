package com.yi.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * @author YI
 * @date 2018-12-5 09:49:38
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/page.html")
    public String page(){
        return "page";
    }
}

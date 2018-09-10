package com.halous.parentsbase.controller;

import com.halous.parentsbase.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/insert")
    public void queryUserInfo(){
        userInfoService.queryUserInfo("1");
    }
}

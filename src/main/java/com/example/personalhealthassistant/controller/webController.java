package com.example.personalhealthassistant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class webController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "/web/index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginForm(){
        return "/web/login/index";
    }
}

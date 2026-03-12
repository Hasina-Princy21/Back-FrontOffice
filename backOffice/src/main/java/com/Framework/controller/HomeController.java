package com.Framework.controller;
import com.hasinaFramework.annotation.Controller;
import com.hasinaFramework.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Welcome to the framework!";
    }    
}

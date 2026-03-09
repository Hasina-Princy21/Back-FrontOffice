package com.Framework.controller;
import com.hasinaFramework.annotation.Controller;
import com.hasinaFramework.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/wel")
    public String home(){
        return "Welcome!";
    }    
}

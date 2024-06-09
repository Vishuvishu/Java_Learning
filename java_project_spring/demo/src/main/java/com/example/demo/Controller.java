package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/get")
    public  String doGet(){
        return "hii get mappiing calling";  
    }

    @PostMapping("/post")
    public  String doPost(){
        return "hii post mappiing calling";  
    }

    @GetMapping("/demoget")
    public static String getdemo(@RequestParam int num1,@RequestParam int num2)
    {
        int ans = num1+num2;
        return "answer is "+ans;
    }
}

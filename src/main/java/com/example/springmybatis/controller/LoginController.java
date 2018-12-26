package com.example.springmybatis.controller;


import com.example.springmybatis.domains.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "hello world";
    }


    @PostMapping("/{id}")
    public void getUser(@PathVariable int id ,@RequestBody User user){
        System.out.println(id);
        System.out.println(user);
    }
}

package com.example.almtool.controller;


import com.example.almtool.dto.UserLoginRequest;
import com.example.almtool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alm")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/login")
     public String UserLogin(@RequestBody UserLoginRequest userLoginRequest){
        String response = userService.getLoginResponse(userLoginRequest);
        return  response;
    }

    @GetMapping("/{userid}")
    public String UserProfile(@PathVariable String userid){
        return userService.getUserProfile(userid);
    }

}

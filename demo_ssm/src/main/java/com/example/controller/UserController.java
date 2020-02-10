package com.example.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.entity.UserEntity;
import com.example.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;

//    @Autowired
//    private HttpServletResponse response;

    @ResponseBody
    @RequestMapping("getUser/{id}")
    public JSONObject getUser(@PathVariable int id){
        UserEntity user = userService.Sel(id);

        JSONObject result = new JSONObject();
        result.put("name", user.getUserName());

        return result;
    }

    @ResponseBody
    @RequestMapping("getUserAll")
    public JSONObject getUserAll(){
        List<UserEntity>  userEntityListist = userService.getUserAll();

        JSONObject result = new JSONObject();
        result.put("data", userEntityListist.toString());

        return result;
    }
}

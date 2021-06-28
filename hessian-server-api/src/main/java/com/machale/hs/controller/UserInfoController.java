package com.machale.hs.controller;


import com.machale.client.hs.model.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @GetMapping(path = "/user")
    public UserInfo provideUserInfo(@RequestParam String id, @RequestParam String name) {
        return new UserInfo(id, name);
    }

}

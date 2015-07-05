package com.victormiranda.homr.controller;

import com.victormiranda.homr.dto.UserDTO;
import com.victormiranda.homr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by victor on 04/07/15.
 */
@RestController
@RequestMapping("/user-profile")
public class UserProfileController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object hello() {
        return "hello world";
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public void addUser(UserDTO user){
        userService.createUser(user);
    }
}

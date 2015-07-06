package com.javaloping.homr.controller;

import com.javaloping.homr.dto.user.UserDTO;
import com.javaloping.homr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author victormiranda@gmail.com
 */

@RestController
@RequestMapping("/user-profile")
public class UserProfileController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public void addUser(UserDTO user){
        userService.createUser(user);
    }
}

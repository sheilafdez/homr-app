package com.victormiranda.homr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by victor on 04/07/15.
 */
@Controller
@RequestMapping("/user-profile")
public class UserProfileController {

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object hello() {
        return "hello world";
    }
}

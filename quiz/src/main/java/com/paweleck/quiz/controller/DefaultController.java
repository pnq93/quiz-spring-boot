package com.paweleck.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public ModelAndView homePage(){
        return new ModelAndView("/home");
    }

    @RequestMapping("/signUp")
    public ModelAndView signUpPage() {
        return new ModelAndView("/signUp");
    }

    @RequestMapping("/login")
    public ModelAndView loginPage() {
        return new ModelAndView("/login");
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ModelAndView createUser(@RequestParam String signUpLogin) {

        return new ModelAndView("/home").addObject("login", signUpLogin);
    }
}

package com.chinmaya.hotelwebapp.controller;

import com.chinmaya.hotelwebapp.model.User;
import com.chinmaya.hotelwebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/")
//    public String home() {
//        return "index";
//    }

    @RequestMapping("/loginForm")
    public String showLoginForm() {
        return "login";
    }

    @RequestMapping("/registrationForm")
    public String register() {
        return "register";
    }

    @PostMapping ("/saveUser")
    public String saveUserDetails(@ModelAttribute("user") User user) {
//        ModelMap model = new ModelMap();
//        model.addAttribute("email", user.getEmail());
//        model.addAttribute("phoneNumber", user.getPhoneNumber());
//        model.addAttribute("firstName", user.getFirstName());
//        model.addAttribute("lastName", user.getLastName());
//        model.addAttribute("userName", user.getUserName());
//        model.addAttribute("password", user.getPassword());
//        model.addAttribute("role", user.getRole());
//
//        ModelAndView mv = new ModelAndView("success");
//        mv.addObject("user", user);

      //  userService.saveUser(user);
       // return mv;


        userService.saveUser(user);
        return "success";

    }

}

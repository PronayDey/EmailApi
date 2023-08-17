package com.email.EmailApi.controller;

import com.email.EmailApi.util.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailservice;
    @RequestMapping("/Email")
    public String sendMail() {

        emailservice.sendSimpleMail("pronaydey777@gmail.com", "welcome", "Welcome to springBoot");


        return "Email";
    }
}

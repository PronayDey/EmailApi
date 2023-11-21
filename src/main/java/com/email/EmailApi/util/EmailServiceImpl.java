package com.email.EmailApi.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmailServiceImpl implements EmailService {



    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendSimpleMail(String to, String sub, String body) {

        SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo(to);
            msg.setSubject(sub);
             msg.setText(body);



        javaMailSender.send(msg);
    }
}


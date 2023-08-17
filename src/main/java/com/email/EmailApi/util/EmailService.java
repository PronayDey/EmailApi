package com.email.EmailApi.util;

public interface EmailService {
    void sendSimpleMail(String to, String sub, String body);
}

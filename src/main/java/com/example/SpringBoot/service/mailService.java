package com.example.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class mailService {
    @Autowired
	private JavaMailSender sender;
    
    public void sendMail(String to,String sub,String body) {
    	SimpleMailMessage mail=new SimpleMailMessage();
    	mail.setTo(to);
    	mail.setSubject(sub);
    	mail.setText(body);
    	sender.send(mail);
    }
}

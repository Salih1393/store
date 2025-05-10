package com.salih.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService{
    public void send(String message){
        System.out.println("Message:" + message);
        System.out.println("Sent by SMS.");
    }
}

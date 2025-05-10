package com.salih.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService{
    public void send(String message){
        System.out.println("Message:" + message);
        System.out.println("Sent by Email.");
    }
}

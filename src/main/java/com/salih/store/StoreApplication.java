package com.salih.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        var orderService2 = context.getBean(OrderService.class);

        var notificationManager = context.getBean(NotificationManager.class);
        notificationManager.sendNotification("This is a test");

        var resource = context.getBean(HeavyResource.class);
    }

}

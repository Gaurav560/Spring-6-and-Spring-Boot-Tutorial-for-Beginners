package com.telusko.myapppart6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppPart6Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyAppPart6Application.class, args);

        Dev obj = context.getBean(Dev.class);
        obj.build();
    }

}

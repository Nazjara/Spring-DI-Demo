package com.nazjara;

import com.nazjara.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();
    }

}

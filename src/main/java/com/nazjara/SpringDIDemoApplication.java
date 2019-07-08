package com.nazjara;

import com.nazjara.config.PropertyConfig;
import com.nazjara.controller.ConstructorInjectedController;
import com.nazjara.controller.DefaultController;
import com.nazjara.controller.PropertyInjectedController;
import com.nazjara.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDIDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDIDemoApplication.class, args);

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(DefaultController.class).sayHello());

        System.out.println("-----------------------------------------------------------");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUser());
        System.out.println(fakeJmsBroker.getPassword());
        System.out.println(fakeJmsBroker.getUrl());

        PropertyConfig config = ctx.getBean(PropertyConfig.class);
        System.out.println(config.getCustomProperty());
    }
}
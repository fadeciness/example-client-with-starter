package ru.fadeciness.user.info.client.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.fadeciness.user.info.client.service.rest.ExampleClient;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        final ExampleClient bean = context.getBean(ExampleClient.class);
        final String page = bean.mainPage();
        System.out.println(page);
    }

}

package com.jpa;

import com.jpa.models.Currency;
import com.jpa.models.User;
import com.jpa.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");


        RestTemplate restTemplate = new RestTemplate();

        Currency currency = restTemplate.getForObject("https://api.coinmarketcap.com/v1/ticker/?limit=1",Currency.class);
        System.out.println(currency.getName());
        System.out.println(currency.getSymbol());


        UserService userService = ctx.getBean(UserService.class);

        User user = new User();
        user.setName("Ser");
        user.setUsername("Ber");
        System.out.println(userService.findAllUsers());

        userService.insertUser(user);

        System.out.println(userService.findAllUsers().get(0).getName());
    }

}

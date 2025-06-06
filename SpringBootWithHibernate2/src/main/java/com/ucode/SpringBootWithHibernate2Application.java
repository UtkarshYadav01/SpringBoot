package com.ucode;

import com.ucode.entities.User;
import com.ucode.repository.DBOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWithHibernate2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootWithHibernate2Application.class, args);
        DBOperations dbop = context.getBean(DBOperations.class);
        User user = dbop.getUserDetails(1);
        if (user != null) {
            System.out.println(user);
        }else System.out.println("##### USER NOT FOUND #####");
    }
}

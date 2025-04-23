package com.ucode.main.config;

import com.ucode.main.beans.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            System.out.println();
            System.out.println("------------------------");
            System.out.println(stdBean1());
            System.out.println("------------------------");
            System.out.println(stdBean2());
            System.out.println("------------------------");
        };
    }

    @Bean
    public Student stdBean1() {
        return new Student("Deepak", 101, 95.2f);
    }

    @Bean
    public Student stdBean2() {
        return new Student("Amit", 102, 97.5f);
    }
}

package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableJpaRepositories(basePackages = "com.java")
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }
    
    @Bean
    public ViewResolver viewResolver() {
         final InternalResourceViewResolver irv = new InternalResourceViewResolver();
         irv.setPrefix("/WEB-INF/jsp/");
         irv.setSuffix(".jsp");
         return irv;
    }
}

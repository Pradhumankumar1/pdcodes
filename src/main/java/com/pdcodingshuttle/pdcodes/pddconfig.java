package com.pdcodingshuttle.pdcodes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class pddconfig {
    @Bean
    @Scope("prototype")
    Apple getApple(){
        return new Apple();
    }
}

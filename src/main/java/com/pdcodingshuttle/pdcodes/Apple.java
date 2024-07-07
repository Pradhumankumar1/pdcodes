package com.pdcodingshuttle.pdcodes;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {
    void eatApple(){
        System.out.println("I am eating an apple");
    }
    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before use");
    }
    @PreDestroy
    void callThisbeforeAppleIsDestroyed(){
        System.out.println("Bean is destroyed");
    }
}

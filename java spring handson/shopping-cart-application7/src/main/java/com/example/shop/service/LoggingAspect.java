package com.example.shop.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.getItems())")
    public void getItems() {}

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.addItem(..)) && args(item)")
    public void addItem(String item) {}

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.removeItem(..))")
    public void removeItem() {}

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.updateItem(..))")
    public void updateItem() {}

    @Before("getItems()")
    public void logBeforeGetItems() {
        System.out.println("Logging before fetching items...");
    }

    @AfterReturning(pointcut = "addItem(item)", returning = "result")
    public void logAfterAddItem(String item, List<String> result) {
        System.out.println("Logging after adding item: " + item);
    }

    @After("removeItem()")
    public void logAfterRemoveItem() {
        System.out.println("Logging after removing item...");
    }

    @AfterThrowing("updateItem()")
    public void logAfterThrowingUpdateItem() {
        System.out.println("Logging after throwing exception in updateItem...");
    }

    @Around("execution(* com.example.shop.pojo.ShoppingCart.getItems())")
    public void logAroundGetItems() {
        System.out.println("Logging around fetching items...");
    }
}
package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.getItems())")
    public void getItems() {}

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.addItem(..))")
    public void addItem() {}

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.removeItem(..))")
    public void removeItem() {}

    @Pointcut("execution(* com.example.shop.pojo.ShoppingCart.updateItem(..))")
    public void updateItem() {}

    @Before("getItems()")
    public void logBeforeGetItems(JoinPoint joinPoint) {
        System.out.println("Logging before executing getItems method");
    }

    @Before("addItem()")
    public void logBeforeAddItem(JoinPoint joinPoint) {
        System.out.println("Logging before executing addItem method");
    }

    @AfterReturning("addItem()")
    public void logAfterReturningAddItem(JoinPoint joinPoint) {
        System.out.println("Logging after returning from addItem method");
    }

    @AfterThrowing("addItem()")
    public void logAfterThrowingAddItem(JoinPoint joinPoint) {
        System.out.println("Logging after throwing exception from addItem method");
    }

    @Before("removeItem()")
    public void logBeforeRemoveItem(JoinPoint joinPoint) {
        System.out.println("Logging before executing removeItem method");
    }

    @Before("updateItem()")
    public void logBeforeUpdateItem(JoinPoint joinPoint) {
        System.out.println("Logging before executing updateItem method");
    }

    @AfterReturning("updateItem()")
    public void logAfterReturningUpdateItem(JoinPoint joinPoint) {
        System.out.println("Logging after returning from updateItem method");
    }

    @AfterThrowing("updateItem()")
    public void logAfterThrowingUpdateItem(JoinPoint joinPoint) {
        System.out.println("Logging after throwing exception from updateItem method");
    }
}
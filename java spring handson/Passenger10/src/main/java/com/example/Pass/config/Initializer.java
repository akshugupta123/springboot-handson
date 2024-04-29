package com.example.Pass.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan(basePackages = {"com.example.Pass.config", "com.example.Pass.dao"})
@PropertySource(value = {"classpath:application.properties"})
public class Initializer {
}

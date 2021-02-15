package com.example.orderexample;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class Car implements Rideable {
    @Override
    public String getName() {
        return "Car";
    }
}

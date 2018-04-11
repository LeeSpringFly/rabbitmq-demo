package com.lee.rabbitmqdatabase.controller;

import com.lee.rabbitmqdatabase.entity.Sensor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sensor")
public class SensorController {

    @GetMapping("{id}")
    public Sensor findById(@PathVariable Long id) {
        System.out.println("database sensor save()");
        return new Sensor();
    }
}

package com.lee.rabbitmqdatabase.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Sensor implements Serializable {
    private Long id;
    private String name;
    private Set<SensorValue> sensorValues = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SensorValue> getSensorValues() {
        return sensorValues;
    }

    public void setSensorValues(Set<SensorValue> sensorValues) {
        this.sensorValues = sensorValues;
    }

}

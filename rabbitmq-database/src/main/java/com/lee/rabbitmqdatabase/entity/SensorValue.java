package com.lee.rabbitmqdatabase.entity;

import java.io.Serializable;

public class SensorValue implements Serializable {
    private Long id;
    private Long sensorId;
    private Integer value;

    public SensorValue() {

    }

    public SensorValue(Long sensorId) {
        this.sensorId = sensorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("id:").append(getId())
                .append("sensor id:").append(getSensorId())
                .append("value:").append(getValue())
                .toString();
    }
}

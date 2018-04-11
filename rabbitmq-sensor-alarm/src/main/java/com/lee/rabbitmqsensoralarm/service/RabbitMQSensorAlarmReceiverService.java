package com.lee.rabbitmqsensoralarm.service;

import org.springframework.stereotype.Service;

@Service
public class RabbitMQSensorAlarmReceiverService {

    public void receiveMessage(String message) {
        System.out.println("接收数据: " + message + "");
    }
}

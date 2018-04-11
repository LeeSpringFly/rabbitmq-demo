package com.lee.rabbitmqsensorcommunication.service;

import com.lee.rabbitmqdatabase.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SensorCommunicationService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private final String routingKey = "lee.sensor.communication";

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void sensMessage() {
        System.out.println("发送要保存的传感器数据 ...");
        rabbitTemplate.convertAndSend(RabbitMQConfig.exchange, routingKey, "hello 我要保存传感器数据 !");
    }

}

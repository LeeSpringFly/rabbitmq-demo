package com.lee.rabbitmqdatabase.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
public class RabbitMQReceiverService {

    public void receiveMessage(String message) {
        System.out.println("接收数据: " + message + "");
    }

}

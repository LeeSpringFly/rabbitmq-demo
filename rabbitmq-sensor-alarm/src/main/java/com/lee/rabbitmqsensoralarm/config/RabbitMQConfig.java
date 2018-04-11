package com.lee.rabbitmqsensoralarm.config;

import com.lee.rabbitmqsensoralarm.service.RabbitMQSensorAlarmReceiverService;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String exchange = "spring-boot-exchange";
    public static final String queueName = "sensor-alarm";

    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(exchange);
    }

    @Bean
    public Binding binding(Queue sensorCommunicationQueue, DirectExchange exchange) {
        return BindingBuilder.bind(sensorCommunicationQueue).to(exchange).with("sensor.alarm");
    }

    @Bean
    public SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueName);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    public MessageListenerAdapter listenerAdapter(RabbitMQSensorAlarmReceiverService receiver) {
        return new MessageListenerAdapter(receiver, "receiveMessage");
    }

}

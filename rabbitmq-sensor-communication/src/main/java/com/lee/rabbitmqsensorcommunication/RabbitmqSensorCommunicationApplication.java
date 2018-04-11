package com.lee.rabbitmqsensorcommunication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RabbitmqSensorCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqSensorCommunicationApplication.class, args);
	}
}

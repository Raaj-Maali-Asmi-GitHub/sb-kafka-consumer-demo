package com.web.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
	}
	
	public void addNewMethod(){
		System.out.println("git checout> dev 3 person added in method..how local checkout maintain latest version");
	}

}

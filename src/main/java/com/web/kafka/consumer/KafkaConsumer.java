package com.web.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	//groupid name > anyname
	
	//this is connect to broker(topic) then  reading data 
	@KafkaListener(topics="helloTopic_raj",groupId="consumer-group")
	public void consume(String message) {
		
		//Real project here consume SMS Gateway,Mail Gateway system fetch it....
		System.out.println("Message Consumerd from ,,,"+message);
		
	}

}

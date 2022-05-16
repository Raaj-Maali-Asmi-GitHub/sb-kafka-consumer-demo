package com.web.kafka.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;





@Configuration //
@EnableKafka  //connect topic
public class KafkaConsumerConfig {
	
	@Value("${kafka.broker.address}")
	private String kafkaBrokerAddress;
	@Bean
	public ConsumerFactory<String,String> consumerFactory(){
		
		Map<String,Object> configMaps=new HashMap<>();
		
		configMaps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaBrokerAddress);
		configMaps.put(ConsumerConfig.GROUP_ID_CONFIG,"consumer-group");
		configMaps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
		configMaps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
		
		//configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonObjectSerializer<T>);
		
		
		return new DefaultKafkaConsumerFactory<>(configMaps);
		
	}

}

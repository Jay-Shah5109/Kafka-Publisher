package com.kafka.kafkapublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaPublisherApplication {
	
	@Autowired
	private KafkaTemplate<String,Object> template;
	
	private String topic="kafkatopic";
	
	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name){
		template.send(topic, "Hi " + name + " Welcome to Kafka Spring Boot");
		return "Data Published";
		
	}
	
	@GetMapping("/publishJson")
	public String publishMessage(){
		User user = new User(18,"Jay",new String[]{"Mumbai","BKC","Tower 12"});
		template.send(topic, user);
		return "Data Published";
		
	}
	

	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);
	}

}

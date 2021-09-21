package com.kafka.kafkapublisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private int id;
	private String name;
	private String[] address;
	
	public User(int id, String name, String[] address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	

}

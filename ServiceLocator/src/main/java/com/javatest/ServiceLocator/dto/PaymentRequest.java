package com.javatest.ServiceLocator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PaymentRequest {
	
	private long amount;
	private String paymentMethod;
	
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public PaymentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}

package com.javatest.ServiceLocator.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javatest.ServiceLocator.dto.PaymentRequest;

@Service
@Qualifier("paytm")
public class Paytm implements PaymentService{
	
	@Override
	public String pay(PaymentRequest request){
		return "Amount Rs."+request.getAmount()+"paid using "+request.getPaymentMethod();
	}
	
	
 
}

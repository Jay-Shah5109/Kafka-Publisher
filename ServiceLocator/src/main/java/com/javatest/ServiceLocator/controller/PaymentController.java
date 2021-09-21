package com.javatest.ServiceLocator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatest.ServiceLocator.dto.PaymentRequest;
import com.javatest.ServiceLocator.service.PaymentRegistry;


@RestController
@RequestMapping("/payment-service")
public class PaymentController {
	
	
	// The below commented part is the traditional method, the drawback being that if we need to add a new 
	// payment service, then we will need to change the entire service class by adding a new payment service
	// and it will give rise to tight coupling, which we don't want
	
	/*@Autowired
	private Paytm paytm;
	
	@Autowired
	private PhonePe phonepe;
	
	
	@PostMapping("/pay")
	public String payNow(@RequestBody PaymentRequest request){
		
		String response="";
		if(request.getPaymentMethod().equals("Paytm")){
			response=paytm.pay(request);
		}
		if(request.getPaymentMethod().equals("PhonePe")){
			response=phonepe.pay(request);
		}
		
		return response;
		
	}*/
	
	// So we will be using the payment registry object to solve this issue and make it loosely coupled
	
	
	@Autowired
	private PaymentRegistry registry;
	
	@PostMapping("/pay")
	public String paymentProcess(@RequestBody PaymentRequest request){
		String response="";
		registry.getServiceBean(request.getPaymentMethod()).pay(request);
		return response;
	}
}

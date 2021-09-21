package com.javatest.ServiceLocator.service;

import org.springframework.context.annotation.Bean;

public interface PaymentRegistry {
	
	public PaymentService getServiceBean(String serviceName); 
	// Here in the method getServiceBean, the service name to return will be 
	// taken from the Paytm, PhonePe etc classes where we have defined the @Service annotation on the name
	// of the class

}

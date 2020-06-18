package io.Egen.spring.complex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.Egen.spring.complex.email.EmailService;

@Component
public class NotifService {
	
	
	@Autowired
	@Qualifier("gmailService")
	//Qualifier is used when multiple matching bean is found.In this case awsService and gmailService  
	//property based DI
	private EmailService emailService;
	
	
	//Constructor based DI @Autowired is not manditory but cannot be marked optional i.e. required=false does not works 
	//@Autowired(required in Spring 4 and below)
//	public NotifService(EmailService emailService) {
//		this.emailService=emailService;
//	}
	
	public void  notifyEmail(String to, String message) {
		emailService.sendEmail(to,message );
	}

	//setter based DI:it is optional dependency used in cycic dependency situations
//	@Autowired
//	public void setEmailService(EmailService emailService) {
//		this.emailService = emailService;
//	}
	
	
	

}

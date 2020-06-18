package io.Egen.spring.complex.email;

import org.springframework.stereotype.Component;

@Component("gmailService")
public class GmailService implements EmailService {

	@Override
	public void sendEmail(String toAddress, String body) {
		
		System.out.println("Gmail Email "+ toAddress+" "+ body);
		// TODO Auto-generated method stub

	}

}



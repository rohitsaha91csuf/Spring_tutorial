package io.Egen.spring.complex.email;

import org.springframework.stereotype.Component;

@Component("awsService")
public class AWSEmailService implements EmailService {

	@Override
	public void sendEmail(String toAddress, String body) {
		
		System.out.println("Aws Email "+ toAddress+" "+ body);
		// TODO Auto-generated method stub

	}

}

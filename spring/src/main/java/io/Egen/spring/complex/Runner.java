package io.Egen.spring.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		
		NotifService notifservice=context.getBean(NotifService.class);
		String message="Hello World";
		String to="rohitsaha91@gmail.com";
		notifservice.notifyEmail(to, message);

	}

}

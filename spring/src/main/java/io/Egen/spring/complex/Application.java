package io.Egen.spring.complex;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	
	public Application() {
		System.out.println("Application classs");
	}

}

package io.Egen.spring.simple;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	public void sayHello() {
		System.out.println("HelloWorld");
	}
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

}

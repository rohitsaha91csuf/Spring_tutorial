package io.Egen.spring.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Spring Application");
		
		//HelloWorld hello =new HelloWorld();
		//hello.sayHello();
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Application.class);
		HelloWorld hello= context.getBean(HelloWorld.class);
		hello.sayHello();
		
		
		context.close();
		
		

	}

}

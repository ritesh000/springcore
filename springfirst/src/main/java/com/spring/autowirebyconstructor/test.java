package com.spring.autowirebyconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/autowirebyconstructor/config.xml");
		Employee emp=(Employee) context.getBean("emp");
        System.out.println(emp);
	}

}

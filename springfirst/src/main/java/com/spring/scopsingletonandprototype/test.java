package com.spring.scopsingletonandprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/scopsingletonandprototype/config.xml");
        
		student st=(student) context.getBean("stud");
		System.out.println(st.hashCode());
		System.out.println(st);
	
		Address add=(Address)context.getBean("add1");
		Address add1=(Address)context.getBean("add1");
		System.out.println(add.hashCode());
		System.out.println(add);
		System.out.println(add1.hashCode());
		System.out.println(add1);
		
		
		
		
	}

}

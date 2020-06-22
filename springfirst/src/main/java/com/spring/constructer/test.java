package com.spring.constructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/constructer/config.xml");
		student stu=(student) context.getBean("stu1");
		System.out.print(stu);
		
	}

}

package com.spring.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/innerbean/config.xml");
		student stu=(student) context.getBean("stud1");
		System.out.println(stu);

	}

}

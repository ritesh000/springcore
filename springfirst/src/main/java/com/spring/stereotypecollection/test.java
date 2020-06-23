package com.spring.stereotypecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/stereotypecollection/config.xml");
		student stu=(student) context.getBean("student");
		System.out.println(stu);
	}

}

package com.first.springfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/first/springfirst/config.xml");
		student stu=(student) context.getBean("stu");
		System.out.println(stu);

	}

}

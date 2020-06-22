package com.spring.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/set/config.xml");
       color col=(color) context.getBean("colo");
       System.out.println(col);
	}

}

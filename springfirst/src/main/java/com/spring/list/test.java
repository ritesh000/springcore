package com.spring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/list/config.xml");
       color col=(color) context.getBean("colo");
       System.out.println(col);
	}

}

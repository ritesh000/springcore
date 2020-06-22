package com.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/map/config.xml");
		colourmap map=(colourmap) context.getBean("colomap");
		System.out.println(map);

	}

}

package com.spring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/property/config.xml");
		countryandlanguage cont=(countryandlanguage) context.getBean("contlan");
		System.out.println(cont);
	}

}

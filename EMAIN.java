package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EMAIN {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("conff.xml");
		EMPLOYEE s=context.getBean(EMPLOYEE.class);
		System.out.println(s);

	}

}

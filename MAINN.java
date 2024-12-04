package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAINN {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("confi.xml");
		STUDENT s=context.getBean(STUDENT.class);
		System.out.println(s);

	}

}

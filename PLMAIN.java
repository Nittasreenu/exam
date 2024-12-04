package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PLMAIN {

	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(configgg.class);
		PLAYERS p=context.getBean(PLAYERS.class);
		System.out.println(p);
		

	}

}

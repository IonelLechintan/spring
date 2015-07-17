package com.garmin.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static  ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld hell=context.getBean(HelloWorld.class);
//		Magic magic=context.getBean(Magic.class);
		new App(hell).execute();
	}
}

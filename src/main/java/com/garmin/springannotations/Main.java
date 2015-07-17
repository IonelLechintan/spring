package com.garmin.springannotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws InterruptedException {


		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		Bar bar = applicationContext.getBean("bar", Bar.class);
		bar.printFooName();
		 
	}
}

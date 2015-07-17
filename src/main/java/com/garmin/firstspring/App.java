package com.garmin.firstspring;

import com.garmin.firstspring.abstraction.Interface;

public class App {
	Interface example = null;
 

	public App(Interface example) {
		this.example = example;
	 
		 
	}

	public void execute() {
		example.doSomething();
	}
}

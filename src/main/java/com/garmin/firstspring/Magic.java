package com.garmin.firstspring;

import com.garmin.firstspring.abstraction.Interface;

public class Magic implements Interface {

	public Magic() {
		System.out.println("m-am creat");
	}

	public void doSomething() {
		System.out.println("Magic here");
	}
}

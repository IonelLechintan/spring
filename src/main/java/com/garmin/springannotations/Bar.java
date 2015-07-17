package com.garmin.springannotations;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bar {
	
	@Autowired
	@Qualifier(value = "secondaryFoo") 
	private Foo foo;
	
	@Resource(name="otherFoo")
	private Foo foo2;
	
	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	

	public void printFooName() {
		System.out.println(foo.getName());
		 System.out.println(foo2.getName());
	}
}
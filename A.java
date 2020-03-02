package com.spring.test.SpringTest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {
	B b;
	public A(@Lazy B b) {
		this.b=b;
	}
	/*
	 * public void setB(B b) { this.b = b; }
	 */
	
	public void doSomething() {
		System.out.println("doing something");
	}
}

package com.practice.lamda;

import java.util.ArrayList;
import java.util.HashMap;

public class Greeter {
	 
	public void greet(IGreeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		IGreeting helloworldgreeting = new HelloWorldGreeting();
		greeter.greet(helloworldgreeting);
		
		IGreeting lamdaGreeting = ()-> System.out.println("Hello Java8 Lamda World");
		lamdaGreeting.perform();
		// greeter.greet(lamdaGreeting);
		
		
		IGreeting innerClassGreeting = new IGreeting() {
			public void perform() {
				System.out.println("Hello innerClassGreeting World");
			}
		};
		
		innerClassGreeting.perform();
		
		
		
		
	}

}

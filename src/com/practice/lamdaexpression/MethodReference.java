package com.practice.lamdaexpression;

interface Sayable1{
	void say();
	
}

public class MethodReference {
	private int x = 10;
	static {
		System.out.println("inside static block");
	}
	public static void saySomething1() {
		System.out.println("Hello, this is static method");
	}
	public static void saySomething() {
		
		System.out.println("Hello, this is static method");
	}
	public static void main(String[] args) {
		Sayable1 say1 = MethodReference::saySomething;
		say1.say();
	}

}

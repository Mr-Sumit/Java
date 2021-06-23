package com.practice.collection;

public class ExceptionHandlingExamples {
	public void throwException() {
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try {
			System.out.println("Inside try1");
			System.out.println("Inside try2");
			System.out.println("Inside try3");
			new ExceptionHandlingExamples().throwException();
			System.out.println("Inside try4");
		}catch(Exception e) {
			System.out.println("Inside catch");
		}finally {
			System.out.println("Inside finally");
		}

	}

}

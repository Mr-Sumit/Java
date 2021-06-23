package com.practice.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int rem = ExceptionExample.devide(100,0);
			
			System.exit(1);
			System.out.println("Ans is ::"+ rem);
		}finally {
			System.out.println("Inside main finally method");
		}

	}
	
	public static int devide(int a, int b) {
		int result = 0;
		try {
			 result = a/b;
			return result;
		}catch(ArithmeticException e){
			System.out.println("Inside devide catch block");
		}catch(Exception e){
			System.out.println("Inside devide catch block");
		}finally {
			System.out.println("Inside devide finally block");
		}
		return result;
	}

}

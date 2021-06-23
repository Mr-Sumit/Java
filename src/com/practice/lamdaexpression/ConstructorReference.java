package com.practice.lamdaexpression;


@FunctionalInterface
interface Messageable{
	Message getMessage(String msg);
	
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class ConstructorReference {
	public static void main(String[] args) {
		Messageable m = Message:: new;
		Message msg = m.getMessage("Hello");
		
	}
}

package com.practice.lamdaexpression;

interface Drawable{
	public void draw();
}

interface Sayable{
	public String say(String name);
}

public class LamdaExpressionExample1 {
	
	public static void main(String[] args) {
//		Drawable d1 = () -> System.out.println("drawing from main class");
//		d1.draw();
		
		Sayable s1 = (name)->  "Hello" + name; 
		System.out.println(s1.say("Sumit kumar"));
	}

}

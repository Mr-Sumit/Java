package com.practice.functionreference;

@FunctionalInterface
interface IPerson {
	void showPersonMessage(String name);
}

public class FunctionalReferenceExample {
	
	
	
	public static void main(String[] args) {

		IPerson p = (name) -> {
			System.out.println(name);

		};

		p.showPersonMessage("Sumit");
	}

}

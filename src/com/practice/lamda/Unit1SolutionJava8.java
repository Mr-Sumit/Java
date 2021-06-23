package com.practice.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1SolutionJava8 {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlottle","Bronte",45),
				new Person("Matthew","Arnold",39));
		
				// sort List by Last name
				Collections.sort(personList,  (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
				// print all Person
				printAll(personList);
				
				// print all person which last name beginning with C
				printConditionally(personList, p ->
						 p.getLastName().startsWith("C"));
				// print all person which First name beginning with M				
				printConditionally(personList, p ->
				 p.getFirstName().startsWith("M"));
	}
	
	private static void printConditionally(List<Person> personList, Condition condition) {
		for(Person p : personList) {
			if(condition.test(p)) {
				System.out.println(p.toString());	
			}		
		}
	}
	

	private static void printAll(List<Person> personList) {
		for(Person p : personList) {
			System.out.println(p.toString());
		}	
	}
}



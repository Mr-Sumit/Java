package com.practice.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1SolutionJava7 {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlottle","Bronte",45),
				new Person("Matthew","Arnold",39));
		// sort List by Last name
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		// print all Person
		printAll(personList);
		
		// print all person which last name begining with C
		lastNameBeginingWithC(personList);

	}

	private static void printAll(List<Person> personList) {
		for(Person p : personList) {
			System.out.println(p.toString());
		}
		
	}
	
	private static void lastNameBeginingWithC(List<Person> personList) {
		for(Person p : personList) {
			if(p.getLastName().startsWith("C")) {
				System.out.println(p.toString());	
			}
			
		}
		
	}

}

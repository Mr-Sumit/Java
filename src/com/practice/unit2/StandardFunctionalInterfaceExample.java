package com.practice.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.practice.lamda.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlottle","Bronte",45),
				new Person("Matthew","Arnold",39));
		
				// sort List by Last name
				Collections.sort(personList,  (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
				
				System.out.println("print all Person");
				performConditionally(personList, p ->
				 true, p-> System.out.println(p));
				
				System.out.println("print all person which last name beginning with C");
				performConditionally(personList, p ->
						 p.getLastName().startsWith("C"), p-> System.out.println(p));
				
				System.out.println("print all person which First name beginning with M");				
				performConditionally(personList, p ->
				 p.getFirstName().startsWith("M"),p-> System.out.println(p));
	}

	private static void performConditionally(List<Person> personList, Predicate<Person> perdicate, Consumer<Person> consumer) {
		for(Person p : personList) {
			if(perdicate.test(p)) {
				consumer.accept(p);
			}		
		}
	}

	

}

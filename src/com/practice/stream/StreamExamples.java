package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");
		
		Stream<String> listStream = list.stream();
		
		Stream<String> lowercaseStream = listStream.map((element) -> {
			return element.toLowerCase();
		});
		
		Stream<String> uppercaseStream = lowercaseStream.map((element) -> {
			return element.toUpperCase();
		});
		
		uppercaseStream.forEach(str -> System.out.println(str));
		System.out.println("map example");
		list.stream().map(element -> element.toLowerCase())
				.map(element -> element.toUpperCase())
				.forEach(ele -> System.out.println(ele));
		
		System.out.println("***************");
		System.out.println("flat map example");
		System.out.println("***************");
		List<String> stringList = new ArrayList<String>();		
		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill One a muckingbird");
		stringList.add("Gone with the One wind");
		
		
		Stream<String> stringListStream = stringList.stream();

		stringListStream.flatMap((value) -> {
		    String[] split = value.split(" ");
		    return (Stream<String>) Arrays.asList(split).stream();
		})
		.forEach((value) -> System.out.println(value));
		
		System.out.println("***************");
		System.out.println("Count example");
		System.out.println("***************");
		System.out.println(list.stream().map(element -> element.toLowerCase())
				.map(element -> element.toUpperCase())
				.count());
		
		
		System.out.println("***************");
		System.out.println("allMatch example");
		System.out.println("***************");
		
		boolean allMatchResult = stringList.stream().allMatch((value)-> value.contains("one"));
		System.out.println("allMatchResult = " + allMatchResult);
		
		System.out.println("***************");
		System.out.println("Reduce example");
		System.out.println("***************");
		
		Optional<String> reduced = stringList.stream().reduce((value, combinedValue) -> {
		    return combinedValue + " " + value;
		});

		System.out.println(reduced.get());
		
		System.out.println("***************");
		System.out.println("toArray example");
		System.out.println("***************");
		
		Object[] object = stringList.stream().toArray();
		
		for(var ele : object) {
			System.out.println(ele.toString());
		}
		System.out.println("***************");
		System.out.println("Array to stream example");
		System.out.println("***************");
		Stream.of(object).forEach(ele -> System.out.println(ele));
		
	}

}

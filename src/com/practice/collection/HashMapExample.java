package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HashMapExample {

	public static void main(String[] args) {
		String s1="Sumit";
		String s2 = new String("Sumit");
		String s3 = new String("Sumit");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1.equals(s2));
		
		Map<String,String> demoMap=new HashMap<String,String>();
		demoMap.put("Sumit", "ABC");
		demoMap.put(new String("Sumit"), "xyz");
		System.out.println(demoMap.size());
		System.out.println(demoMap.get("Sumit"));
		
		
		
		
		
		
//		Map<Integer,String> map=new HashMap<Integer,String>();          
//	      map.put(100,"Amit");    
//	      map.put(101,"Vijay");    
//	      map.put(102,"Rahul"); 
//	      map.put(100, "Sumit");
//	      System.out.println(map.entrySet());
//	      map.keySet().stream().sorted().forEach(System.out::println);
//	      map.values().stream().sorted().forEach(System.out::println);
//	      
//	      map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//
//	      List<String> keys = new ArrayList<String>();
//	      keys.add("Mango");
//	      keys.add("Apple");    
//	      keys.add("Banana");    
//	      keys.add("Grapes");    
//	      
//	      
//	      List<Integer> values = new ArrayList<Integer>();
//	      values.add(1);
//	      values.add(2);    
//	      values.add(3);    
//	      values.add(4);
//	      
//	      System.out.println(HashMapExample.zipToMap(keys, values));
//	      
	      
	      
	}
	
	public static <K, V> Map<K, V> zipToMap(List<K> keys, List<V> values) {
	    return IntStream.range(0, keys.size()).boxed()
	            .collect(Collectors.toMap(keys::get, values::get));
	}

}

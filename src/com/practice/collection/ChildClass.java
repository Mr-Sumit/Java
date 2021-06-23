package com.practice.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ChildClass {
	public static void main(String args[]) {
		System.out.print(ChildClass.myMethod());
		try {
			FileReader fr = null;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static int myMethod() {
		try {
			return -1;
		} finally {
			return 0;
		}
	}
}
package com.practice.thread;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;

public class TestInterruptingThread extends Thread{
	
	public void run() {
		//try {
			System.out.println("going to Sleep");
			// System.out.println(Thread.interrupted());
			// Thread.sleep(1000);
			
//		}catch(InterruptedException e) {
//			
//			System.out.println("inside Run method Catch block" +e);
//			throw new RuntimeException("Thread Interrupted"+e);
//		}
		System.out.println("Thread Running...");
	}
	
	public static void main(String[] args) {
		TestInterruptingThread  t1 =  new TestInterruptingThread();
		t1.start();
		
		try {
			
			System.out.println("going to interrupt");
			t1.interrupt();
			System.out.println(t1.isInterrupted());
			
		}catch(Exception e) {
			
			System.out.println("Handled main method catch block"+e);
		}
		
	}

}

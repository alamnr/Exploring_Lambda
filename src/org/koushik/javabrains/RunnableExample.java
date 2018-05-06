package org.koushik.javabrains;

import java.lang.invoke.LambdaConversionException;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
				
			}
		});

		myThread.start();
		
		// Since Runnable Interface has only one abstract method hence it's a good candidate for Lambda expression and 
		// for backword compatability JDK 1.8 does not introduce new function type for lambda, the type for lambda is an interface with single abstract method/function
		// This type of interfaces with only one abstract method is called functional interface
		
		Thread lamdaThread = new Thread(()->System.out.println("Printed inside Lambda Runnable"));
		lamdaThread.run();
	}

}

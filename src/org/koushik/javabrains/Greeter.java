package org.koushik.javabrains;

public class Greeter {
	
	/*public void greet(){
		System.out.println("Hello World!");
	}*/
	
	public void greet(Greeting greeter){
		greeter.perform();
	}
	
	public static void main(String[] args){
		Greeter greet = new Greeter();
		
		//greet.greet();
		
		
		// Greeting using Interface Implementer
		
		Greeting greeter = new HelloWorldGreeting();
		greet.greet(greeter);
		
		// Greet Using anonymous Inner class 
		Greeting annonymousInnerClass = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World!   -  greeting using anonymous inner class");
				
			}
		};
		
		greet.greet(annonymousInnerClass);
		
		// Greet using Lamda expression - functional interface - incase of Lambda each Interface type must have only one abstract method /  function
		
		Greeting  lambdaExpGreet = () -> System.out.println("Hello World!  -  greeting using lambda expression");
		
		greet.greet(lambdaExpGreet);
		
	}

}

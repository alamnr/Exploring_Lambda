package org.koushik.javabrains;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World!   -  greeting using Interface implementer");

	}

}

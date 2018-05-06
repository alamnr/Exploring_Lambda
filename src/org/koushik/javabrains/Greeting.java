package org.koushik.javabrains;

// Recommended to use this annotation for Lamda Functional Interface, so that other can't add new abstract method in this interface 
@FunctionalInterface
public interface Greeting {
	
	public void perform();
}

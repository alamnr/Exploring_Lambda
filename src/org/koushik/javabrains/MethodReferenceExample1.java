package org.koushik.javabrains;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		//Thread  t  =  new Thread(()->printMessage());
		// Static method or class method
		Thread  t  =  new Thread(MethodReferenceExample1::printMessage);
		t.start();
	}
	
	public static void printMessage(){
		System.out.println("Hello");
	}

}

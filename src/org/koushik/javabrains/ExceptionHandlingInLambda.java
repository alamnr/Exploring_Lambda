 package org.koushik.javabrains;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {

	public static void main(String[] args) {
		int[] somenumbers = {1,2,3,4};
		int key = 0;
		
		//process(somenumbers,key,(v,k)->System.out.println(v+k));
		/*process(somenumbers,key,(v,k)->{
			try {
				System.out.println(v/k);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception happen");
			}
		
		});*/
		
		process(somenumbers,key,wrapperLambda((v,k)->System.out.println(v/k)));

	}

	private static void process(int[] somenumbers, int key, BiConsumer<Integer, Integer> consumer) {
		
		for (int i : somenumbers){
			//System.out.println(i+key);
			consumer.accept(i, key);
		}
		
	}
	
	private static BiConsumer<Integer, Integer>  wrapperLambda(BiConsumer<Integer, Integer> consumer){
		//return consumer;
		return (v,k)->{
			
			try {
				System.out.println("Executing from wrapper");
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caught in Wrapper Lambda");
				
			}
		
		};
	}

}

package org.koushik.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		

		List<Person> people = Arrays.asList(
				new Person("FirstName-1", "LastName-1",60),
				new Person("BFirstName-2", "LastName-2",50),
				new Person("FirstName-5", "LastName-5",40),
				new Person("FirstName-4", "CLastName-4",20),
				new Person("BFirstName-3", "LastName-3",30),
				new Person("FirstName-6", "CLastName-6",40)
				
				);
		
		// Step-2: Create a method that prints all element in list
		System.out.println("Print all person");
		//printConditionally(people, p->true,p->System.out.println(p));
		// instance method
		printConditionally(people, p->true,System.out::println);
		
		
	}
	
	private static void printConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer)
	{
		 for (Person p: people){
			 if(predicate.test(p))
			 {
				consumer.accept(p);
			 }
			}
	}

}

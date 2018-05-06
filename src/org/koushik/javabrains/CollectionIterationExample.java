package org.koushik.javabrains;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
	
public static void main(String[] args) {
		
		
		List<Person> people = Arrays.asList(
				new Person("FirstName-1", "LastName-1",60),
				new Person("BFirstName-2", "LastName-2",50),
				new Person("FirstName-5", "LastName-5",40),
				new Person("FirstName-4", "CLastName-4",20),
				new Person("BFirstName-3", "LastName-3",30),
				new Person("FirstName-6", "CLastName-6",40)
				
				);
		
		System.out.println("Using for  loop");
		
		for (int i=0;i<people.size();i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");
		
		for(Person p: people)
		{
			System.out.println(p);
		}
		
		System.out.println("Using lambda");
		
		//people.forEach(person -> System.out.println(person));
		people.forEach(System.out::println);
}

}

package org.koushik.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutinJava8 {
public static void main(String[] args) {
		
		
		List<Person> people = Arrays.asList(
				new Person("FirstName-1", "LastName-1",60),
				new Person("BFirstName-2", "LastName-2",50),
				new Person("FirstName-5", "LastName-5",40),
				new Person("FirstName-4", "CLastName-4",20),
				new Person("BFirstName-3", "LastName-3",30),
				new Person("FirstName-6", "CLastName-6",40)
				
				);
		
		// Step-1: Sort list by last name
		
		Collections.sort(people,(p1, p2)->	p1.getLastName().compareTo(p2.getLastName()));
		
		// Step-2: Create a method that prints all element in list
		System.out.println("Print all person");
		//printAll(people);
		//printConditionally(people, p->true);
		printConditionally(people, p->true,p->System.out.println(p));
		
		
		// Step-3: Create a method that prints all the people that have last name begining with C
		
		System.out.println("Print person last name begining with C");
		//printLastNameBeginingWithC(people);
		//printConditionally(people, p->p.getLastName().startsWith("C"));
		printConditionally(people, p->p.getLastName().startsWith("C"),p->System.out.println(p));
		
		
		System.out.println("Print person first name begining with B");
		//printConditionally(people, p->p.getFirstName().startsWith("B"));
		printConditionally(people, p->p.getFirstName().startsWith("B"),p->System.out.println(p));
	}

		
	/*private static void printConditionally(List<Person> people, Condition condition){
		 for (Person p: people){
			 if(condition.test(p))
			 {
				System.out.println(p);
			 }
			}
	}*/
	
	/*private static void printConditionally(List<Person> people, Predicate<Person> predicate){
		 for (Person p: people){
			 if(predicate.test(p))
			 {
				System.out.println(p);
			 }
			}
	}
*/
	
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



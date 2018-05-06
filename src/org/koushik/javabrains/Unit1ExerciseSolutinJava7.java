package org.koushik.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutinJava7 {
	
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
		
		Collections.sort(people,new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		// Step-2: Create a method that prints all element in list
		System.out.println("Print all person");
		printAll(people);
		
		
		// Step-3: Create a method that prints all the people that have last name begining with C
		
		System.out.println("Print person last name begining with C");
		//printLastNameBeginingWithC(people);
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("C");
			}
		});
		
		
		System.out.println("Print person first name begining with B");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				
				return p.getFirstName().startsWith("B");
			}
		});
	}

	private static void printLastNameBeginingWithC(List<Person> people) {
	 
		 for (Person p: people){
			 if(p.getLastName().startsWith("C"))
			 {
				System.out.println(p);
			 }
			}
	
}

	private static void printAll(List<Person> people){
		for (Person p: people){
			System.out.println(p);
		}
	}
	
	private static void printConditionally(List<Person> people, Condition condition){
		 for (Person p: people){
			 if(condition.test(p))
			 {
				System.out.println(p);
			 }
			}
	}
	
}


interface Condition{
	boolean test(Person p);
}
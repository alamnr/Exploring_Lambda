package org.koushik.javabrains;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("FirstName-1", "LastName-1",60),
				new Person("BFirstName-2", "LastName-2",50),
				new Person("FirstName-5", "LastName-5",40),
				new Person("FirstName-4", "CLastName-4",20),
				new Person("BFirstName-3", "LastName-3",30),
				new Person("FirstName-6", "CLastName-6",40)
				
				);
		
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.getLastName()));
		
		/*long count = people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.count();*/
		
		long count = people.parallelStream()
				.filter(p->p.getLastName().startsWith("C"))
				.count();
		
		System.out.println(count);

	}

}

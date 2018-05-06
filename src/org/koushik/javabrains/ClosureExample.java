package org.koushik.javabrains;

public class ClosureExample {
	
	public static void main(String[] args)
	{
		int a= 10;
		int b=20;
		// closure - when inner function has access to the variable of its enclosing function
		doProcess(a,i->System.out.println(i+b));
	}

	private static void doProcess(int i, Process p) {
	
		p.process(i);
	}

}

interface Process{
	void process(int i);
}

package org.koushik.javabrains;

public class TypeInference {
	
	public static void main(String[] args){
		//StringLengthLambda stringLengthLambda = (String s) -> s.length();
		/*StringLengthLambda stringLengthLambda = s -> s.length();
		System.out.println(stringLengthLambda.getLength("Hello Lambda!"));
		*/
		
		printLambda(s->s.length());
	}
	
	public static void  printLambda(StringLengthLambda l)
	{
		System.out.println(l.getLength("Hello Lamda!"));
	}

}

interface StringLengthLambda{
	int getLength(String s);
}

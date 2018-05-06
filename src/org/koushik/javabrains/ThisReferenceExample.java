package org.koushik.javabrains;

public class ThisReferenceExample {

	public void doProcess(int i, Process p){
		p.process(i);
	}
	
	public void execute(){
		doProcess(10,i->{ 
			
			System.out.println("Value of i is- "+ i);
			// here in a non static method this reference point to this class
			System.out.println(this); 
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		//System.out.println(this); //  you can't call this with in static method
		// but you can call this inside anonymous innerclass' instance method
		// here this reference point to the anonymous inner class - Process
		thisReferenceExample.doProcess(10, new Process(){

			@Override
			public void process(int i) {
				System.out.println("Value of i is - "+i);
				System.out.println(this);
				
			}
			
			public String toString(){
				return "This is the anonymous inner class";
			}
			
		});
		
		/*thisReferenceExample.doProcess(10,i->{ 
		
			System.out.println("Value of i is- "+ i);
			
			//System.out.println(this); // same for Lambda expression,  you can't call this with in static context
		});*/
		
		thisReferenceExample.execute();
	}
	
	public String toString(){
		return "This is the main ThisReference class  instance";
	}

}

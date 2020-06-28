package oops_concepts;

public class Arthametic_results {

	public static void main(String[] args) {
		
		ArthameticOperatations1 operation = new ArthameticOperatations1();
		
		operation.addition(5, 7);
		operation.doDevision(320, 8);
		operation.doMultiplication(5, 2);
		
		operation.display();
		System.out.println("value of the variable named num in child class:"+ operation.num);
		operation.display_method();
        operation.messge();
	}

}

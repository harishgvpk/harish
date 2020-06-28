package oops_concepts;

public class ArthameticOperatations {

	int num = 20;
	
	public int addition(int a , int b ) {
		int result= a + b;	
		System.out.println("Addition result is :" +result);
		return result;
	}
	
	public int doSub(int a , int b ) {
		int result= a - b;	
		System.out.println("Sub result is :" +result);
		return result;
	}
	public int doMultiplication(int a , int b ) {
		int result= a * b;	
		System.out.println("Multiplication result is :" +result);
		return result;
	}
	
	public void display() {
	      System.out.println("This is the display method of parentclass");
	   }
	
	public void messge() {
	      System.out.println("OOPs concepts");
	   }


}

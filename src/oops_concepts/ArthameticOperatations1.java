package oops_concepts;

public class ArthameticOperatations1 extends ArthameticOperatations {

	int num = 10;
	public int doDevision(int a , int b ) {
		int result= a / b;	
		System.out.println("Devision result is :" +result);
		return result;
	}
	public int addition(int x , int y ) {
		int result= x + y;	
		System.out.println("Addition result is :" +result);
		return result;
	}

	public void display() {
		System.out.println("This is the display method of childclass");
	}
	public void display_method() {
		super.display();
		System.out.println("value of the variable named num in parent class:"+ super.num);
	}
	
	public void messge() {
	      System.out.println("OOPs java concepts");
	   }
}

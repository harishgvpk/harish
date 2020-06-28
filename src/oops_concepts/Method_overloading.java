package oops_concepts;

public class Method_overloading {

	static int Multiplication(int a, int b) 
	{ 
		int rslt= a*b;
		System.out.println("result is ==>>" +rslt );
		return rslt; 
	}  
	static double Multiplication(double a, double b) 
	{ 
		return a * b; 
	} 
	
	public void addition(int a,int b) {
		int sum = a+b;
		System.out.println("sum of 2 numbers is ==>>" +sum );
	}
	public void addition(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println("sum of 3 numbers is ==>>" +sum );
	}

	final void addition1(int a,int b) {
		int sum = a+b;
		System.out.println("sum of 2 numbers is ==>>" +sum );
	}
	final void addition1(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println("sum of 3 numbers is ==>>" +sum );
	}
	
	private void addition2(int a,int b) {
		int sum = a+b;
		System.out.println("sum of 2 numbers is ==>>" +sum );
	}
	private void addition2(int c) {
		int sum = 5+c;
		System.out.println("sum of 3 numbers is ==>>" +sum );
	}
	
	protected void sub(int a,int b) {
		int sub = a - b;
		System.out.println("subtraction of 2 numbers is ==>>" +sub );
	}
	protected void sub(int c) {
		int sub = 67-c;
		System.out.println("subtraction result is ==>>" +sub );
	}
	public static void main(String[] args) {
		
		double r =Method_overloading.Multiplication(3.4, 4.5);
		System.out.println("double result is ==>>" +r);
		Method_overloading.Multiplication(3, 4);
		
		Method_overloading m = new Method_overloading();
		m.addition(9,8);
		m.addition(5, 7, 3);
		
		m.addition1(5, 6);
		m.addition1(4, 6, 3);
		m.addition2(8);
		m.addition2(8, 1);
		
		m.sub(45);
		m.sub(15, 7);
		
	}

}

package operators;

public class Operators {

	public int addition(int a , int b ) {
		int result= a + b;	
		System.out.println("Addition result is ==>" +result);
		return result;	
	}
	public int substration(int a , int b ) {
		int result= a - b;	
		System.out.println("sub result is ==>" +result);
		return result;
	}
	public int multiplication(int a , int b ) {
		int result= a * b;	
		System.out.println(" multiplication result is :" +result);
		return result;
	}
	public int devision(int a , int b ) {
		int result= a / b;	
		System.out.println(" devision result is :" +result);
		return result;
	}
	public int modulus(int a , int b ) {
		int result= a % b;	
		System.out.println("modulus result is -->" +result);
		return result;
	}
	public int incriment(int a ) {
		int result= ++a ;	
		System.out.println("increment result is -->" +a);
		return result;
	}
	

	public static void main(String[] args) {
		Operators operator = new Operators();
		
		operator.addition(5, 7);
		operator.substration(20, 6);
		operator.multiplication(5, 6);
		operator.devision(400, 6);
		operator.modulus(45, 5);
		operator.incriment(2);
		
		int integer= 5;
		System.out.println("5++ is  ==>>"+ integer++);
		System.out.println(integer);
		System.out.println("++5 is ==>>"+ ++integer);
		System.out.println(" 5-- is==>>"+ integer--);
		System.out.println(" --5 is ==>>"+ --integer);
		System.out.println(integer);
		
		String string = "java"+" programing";
		System.out.println(string);
		
		String s= "Object Oriented lang";
		System.out.println(s+"\n");
		System.out.println("Object\n Oriented \nlang \n");
		
		int i= 5;
		i=i+3;
		System.out.println(i);
		i=i*3;
	    System.out.println(i);
	    i=i/2;
	    System.out.println(i);
	}

}

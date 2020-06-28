package oops_concepts;

public class Specifiers {

	int addNumbers(int a, int b){
		return a+b;
	}

	private int square(int a){
		return a*a;
	}

	protected int squareNumber(int a) {
		return a*a;
	}
	public static void main(String[] args) {

		Specifiers s = new Specifiers();
		System.out.println(s.addNumbers(56, 15));

		System.out.println(s.square(10));
		System.out.println(s.squareNumber(5));
	}

}

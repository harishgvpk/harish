package strings_arrays;

public class Some {


	private static int a,b;
	public static int walk(int a,int b) {
		int r=a+b;
		return r;
	}

	public void swipeNumbers() {
		int a = 10; 
		int b = 5; 
		a = a + b; 
		b = a - b; 
		a = a - b; 
		System.out.println("After swaping   "+ " a ==>> " + a + ", b =+>> " + b); 
	}
	
	public void swipeNumbers1() {
		int a=4;
		int b=8 ,temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("After swaping   "+ " a ==>> " + a + ", b =+>> " + b);
	}
	public static void main(String[] args) {

		Some p = new Some();
		//Some.walk(5,7);
		//p.name="harish";
		//p.age=26;
		int z=Some.walk(4,6);
		System.out.println(z);
		p.swipeNumbers();
		p.swipeNumbers1();

	}
}

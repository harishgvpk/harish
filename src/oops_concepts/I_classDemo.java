package oops_concepts;

public class I_classDemo implements Interface_demo {
	
	@Override
	public void addtion(int a,int b) {
		int sum= a+b;
		System.out.println("sum is ===>" +sum);
	}
	
	@Override
	public void print() {
		System.out.println("Java Program");
	}


	public static void main(String[] args) {
		
		I_classDemo cls = new I_classDemo();
		cls.addtion(5, 8);
		cls.print();
		
	}

}

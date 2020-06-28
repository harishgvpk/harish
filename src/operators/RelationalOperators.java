package operators;

public class RelationalOperators {
	
	int a= 5;
	int b= 7;
	String s1= "relational operators";
	String s2="relational";
	public void equals() {
		System.out.println(a == b);
	}
	public void notequals() {
		System.out.println(a != b);
	}
	public void compare() {
		System.out.println(a > b);
		System.out.println(a < b);
	}
	public void compare1() {
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	
	public static void main(String[] args) {

		RelationalOperators roperators = new RelationalOperators();
		roperators.equals();
		roperators.notequals();
		roperators.compare();
		roperators.compare1();

	}

}

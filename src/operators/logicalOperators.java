package operators;

public class logicalOperators {
	

	public static void main(String[] args) {

		int a = 5, b = 13, c = 21;
		boolean result;

		result = (a > b) || (c > a); //at least one exp is true then its true
		System.out.println(result);

		result = (a > b) && (c > a);
		System.out.println(result);

		result= (b>c) || (b>a);
		System.out.println(result);
		
		result = (a < b) && (a < c); //both expressions should be true
		System.out.println(result);
		
		result = !(a < b) && (a < c);
		System.out.println(result);
	}

}

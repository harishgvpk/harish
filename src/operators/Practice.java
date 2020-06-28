package operators;

public class Practice {

	
	public static void main(String[] args) {
		
		int a=5;
		int b=17;
		int c=10;
		int result,temp ;
		temp=a>b ? a:b;
		result=c > temp ? c:temp;
		System.out.println("the largest number is ==>" +result);

		if (a>b && a>c) {
			System.out.println("a is the largest number");
		}else if(b>c) {
			System.out.println("b is the largest number");
		}else {
			System.out.println("c is the largest number");
		}
		
	}
}

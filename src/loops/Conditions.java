package loops;

public class Conditions {

	public static void main(String[] args) {

		if (2 < 5) {
			System.out.println("2 is less than 5");
		}

		int a = 15;
		int b = 18;
		if (a > b) {
			System.out.println("a is greater than b");
		}

		if(a>b) {
			System.out.println("a is greaterthan b");
		}else {
			System.out.println("b is greaterthan a");
		}

		if( a < b ){ 
			System.out.println("a is small"); 
			if(a > b){
				System.out.println("b is small");
			}
		}
		//positive or negitive
		int num=10;
		if(num > 0)
		{
			System.out.println(" positive number");
		}
		else if(num < 0)
		{
			System.out.println(" negative number");
		}
		else
		{
			System.out.println(" no positive & no negative");
		}

		//even 0r odd
		if ( num % 2 == 0 ) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
		
	}

}

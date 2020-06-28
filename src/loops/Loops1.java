package loops;

public class Loops1 {

	public void sumofNumbers() {

		int a= 10034, count, total=0;
		for(count = 1; count <= a; count++){
			total = total + count;
		}
		System.out.println("Sum natural numbers is: "+total);	
	}

	public void findingEvennumbers() {

		int a= 20;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void multiTable() {
		int number = 5;
		for(int i = 1; i <= 10; ++i)
		{
			System.out.printf("%d * %d = %d \n", number, i, number * i);
		}
	}

	public void factorial() {

		int n=5,factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial = factorial * i;
		}
		System.out.println("factoral of the 5 is ==>> "+factorial);
	}

	public static void main(String[] args) {

		Loops1 loop = new Loops1();
		loop.sumofNumbers();
		loop.findingEvennumbers();
		loop.multiTable();
		loop.factorial();
	}

}

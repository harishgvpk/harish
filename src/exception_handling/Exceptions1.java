package exception_handling;

public class Exceptions1 {

	public static void main(String[] args) {
		try{
			int a=7;
			a=7/0;
			System.out.println(a);

		}
		catch(ArithmeticException e){
			System.out.println(" --->arithmetic Exception ");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("----->arrayIndexOutOfBoundsException");
		}
		catch(Exception e){
			System.out.println("-->>some Other exception");
		}

		try{
			String s = null;
			System.out.println(s.charAt(1));
		}
		catch(ArithmeticException e){
			System.out.println(" --->arithmetic Exception ");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("----->arrayIndexOutOfBoundsException");
		}
		catch(Exception e){
			System.out.println("-->>some Other exception");
		}
	}

}

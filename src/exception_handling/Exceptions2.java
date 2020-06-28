package exception_handling;

public class Exceptions2 {
	
	public void exception_finally() {

		 try{
	         int num=45/0;
	         System.out.println(num);
	      }
	      catch(ArithmeticException e){
	         System.out.println("ArithmeticException");
	      }
	      finally{
	         System.out.println("finally block");
	      }
	}
	
	public void exception_finally1() {

		 try{
	        String s = "program";
	         System.out.println(s);
	         System.out.println(s.charAt(9));
	      }
	      catch(ArithmeticException e){
	         System.out.println("ArithmeticException");
	      }
	      finally{
	         System.out.println("finally block");
	      }
	}

	public static void main(String[] args) {

		try{  
			int num=7/0;  
			System.out.println(num);  
		}  
		catch(ArithmeticException e){
			System.out.println("==>arithmetic Exception");
		}  
		finally{
			System.out.println("It is finally block");
		}  
		
		Exceptions2 exception = new Exceptions2();
		exception.exception_finally();
		exception.exception_finally1();
	}

}

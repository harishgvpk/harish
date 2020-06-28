package exception_handling;

public class Exceptions {

	public static void main(String[] args) {

		try {
			int a=34;
			int b=0;
			int devision=a/b;
			System.out.println(devision);

		} catch (ArithmeticException e) {
			System.out.println(" it is arithmetic Exception ");
		}

		try { 
			String a = " java  "; 
			char c = a.charAt(7); 
			System.out.println(c); 
		}  catch(StringIndexOutOfBoundsException e) { 
			System.out.println(" it is stringIndexOutOfBounds Exception"); 
		} 

		try { 
			String a = null; 
			System.out.println(a.charAt(0)); 
		}catch(NullPointerException e) { 
			System.out.println(" it is nullPointer Exception"); 
		} 

		try{ 
			int a[] = new int[5]; 
			a[6] = 9; 
		} 
		catch(ArrayIndexOutOfBoundsException e){ 
			System.out.println (" array Index is Out Of Bounds"); 
		}
		
		try { 
			String a = null; 
			System.out.println(a.charAt(0)); 
		}catch(NullPointerException e) { 
			e.printStackTrace();
		} 
	}

}

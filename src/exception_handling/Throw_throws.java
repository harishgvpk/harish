package exception_handling;

public class Throw_throws {
	 public void fun() { 
        System.out.println(" java "); 
    } 

	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(10000); 
        System.out.println("Hello");
        
        Throw_throws t = new Throw_throws();
        t.fun();
	}
}

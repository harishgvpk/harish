package loops;

public class Loops {

	public static void main(String[] args) {

		for(int i=0 ; i<=5 ;i++) {

			System.out.println(i);
		}

		int k = 10;
		for(int i=0 ; i<=k ;i++) {

			System.out.print(i);
		}
		//while loop
		while (k <= 15) 
		{ 
			System.out.println("Value of k:" + k); 
			k++; 
		}

		do
		{   
			//k++; 
			System.out.println( k); 
			 k++;
		} 
		while (k <= 16); 

		for(int i=1;i<=5;i++){  
			for(int j=1;j<=i;j++){  
				System.out.print("% ");  
			}  
			System.out.println();
		}  


		for(int i=1;i<=6;i++){  
			for(int j=6;j>=i;j--){  
				System.out.print(" $");  
			}  
			System.out.println();
		} 
		
		/*while(true){  
	        System.out.println("loop");  
	    } */ 

		
	}	
}

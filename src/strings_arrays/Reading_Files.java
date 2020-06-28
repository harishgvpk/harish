package strings_arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reading_Files {

	public void scannerClass_methods() {
		String str = "java is object oriented programming language";   
		Scanner scanner = new Scanner(str);   
		System.out.println("" +scanner.delimiter());  
		while(scanner.hasNext()){  
			String s = scanner.next();
			System.out.println(s);
		}
		scanner.close();         
	}
	public void scannerClass_methods1() {
		System.out.print("Enter Number: ");  
		Scanner scanner = new Scanner(System.in);
		boolean i = scanner.hasNextInt();
		System.out.println(i);
		scanner.close(); 
	}

	public void scannerClass_methods2() {

		String str = "Java programming 23+56 = 34.456 , 00.456 ";  
		Scanner scanner = new Scanner(str);  
		while (scanner.hasNext()) {           
			System.out.println("Scan String: "+scanner.next());  
			System.out.println("Result: "+scanner.hasNextByte());  
		}  
	}


	public void fileReading() throws FileNotFoundException {

		File file = new File(".\\resources\\files\\file.txt");
		Scanner sc = new Scanner(file);
		StringBuffer sb = new StringBuffer();
		while(sc.hasNext()) {
			sb.append(" "+sc.nextLine());
		}
		System.out.println(sb);
	}

	public void fileReading1() throws FileNotFoundException {

		InputStream inputStream = new FileInputStream(".\\resources\\files\\file.txt");
		Scanner sc = new Scanner(inputStream);
		StringBuffer sb = new StringBuffer();
		while(sc.hasNext()) {
			sb.append(" "+sc.nextLine());
		}
		System.out.println(sb);
	}
	
	public void checkLeepyearorNot() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Year:");
    	int year = scanner.nextInt();
    	if(year % 4 == 0) {
    		System.out.println("Entered year is leep year");
    	}else {
    		System.out.println("Entered year is not leep year");
    	}
		
	}
	
	public void addingNumbers_bufferReader() throws NumberFormatException, IOException {

		int a, b, sum;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.print("enter a value ==> ");
		a = Integer.parseInt(br.readLine());
		System.out.print("enter b value ==> ");
		b = Integer.parseInt(br.readLine());
		sum = a + b;

		System.out.println("Sum of numbers is:" + sum);
	}
	
	public void addingNum_bufferReader()  {

		int i,n=0,s=0;
		System.out.println("Input the 5 numbers : ");    
		for (i=0;i<5;i++)
		{
			Scanner in = new Scanner(System.in);
			n = in.nextInt();   
			s +=n;
		}
		System.out.println("sum of numbers is : " +s);	
	}
	public void addingNum_bufferReader1() throws NumberFormatException, IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("first number");
		int a = Integer.parseInt(br.readLine());
		System.out.println("second number");
		int b = Integer.parseInt(br.readLine());
		int sum= a+b;
		System.out.println(" sum of two numbers is : "+sum);
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		Reading_Files rf = new Reading_Files();
		//rf.scannerClass_methods();
		//rf.scannerClass_methods1();
		//rf.scannerClass_methods2();
		//rf.fileReading();
		//rf.fileReading1();
		//rf.checkLeepyearorNot();
		//rf.addingNumbers_bufferReader();
		rf.addingNum_bufferReader();
		rf.addingNum_bufferReader1();
		
	}

}

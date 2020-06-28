package strings_arrays;

import java.util.Scanner;

public class String_Methods2 {

	public void palendrom() {
		String string = "harish";
	      StringBuffer sb = new StringBuffer(string);
	      sb.reverse();
	      String s = sb.toString();
	      if(string.equals(s)){
	         System.out.println("String is palindrome");
	      } else {
	         System.out.println("String is not palindrome");
	      }
	}
	
	public void palendrom1() {
		String myString = "anna";
	      StringBuffer sb1 = new StringBuffer(myString);
	      sb1.reverse();
	      String ss = sb1.toString();
	      if(myString.equals(ss)){
	         System.out.println(" String is palindrome");
	      } else {
	         System.out.println(" String is not palindrome");
	      }
	}
	
	public void reverseWords() {
		
		String string = "java is object oriented programming language";
		String[] array = string.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = array.length - 1; i >= 0; --i) {
			if (!array[i].equals("")) {
				sb.append(array[i]).append(" ");
			}
		}
		System.out.println(sb);
	}
	
	public void reversechar1() {
		String string = "java is object oriented programming language";
		String output = null;
		String[] array = string.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = string.length() - 1; i >= 0; i--) {
	        output = output + string.charAt(i);
	    }
		System.out.println(output);
	}
	
	public void reversechar() {
		String string = "java is object oriented programming language";
		StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		System.out.println(sb);
	}
	
	public void averageofStudentMarks() {
		
		int i ,noofsubjects;
		float total=0;
		float marks,average,percentage;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" enter the Total Number of Subjects : ");
		noofsubjects = scanner.nextInt();
		System.out.print(" enter Marks of Subjects :");
		for(i=0; i<6; i++) { 
	           marks = scanner.nextInt();
	           total = total + marks;
	        }
		System.out.println("total marks is ==>> " +total);
		scanner.close();
		//System.out.println(total);
		average = total/6;
		System.out.println("average of the marks is ==>> " +average);
		
		percentage = (total / (noofsubjects * 100)) * 100;
		System.out.println("percentage of the marks is ==>> " +percentage);
		
	}
	
	
	public static void main(String[] args) {

		String_Methods2 sm = new String_Methods2();
		sm.palendrom();
		sm.palendrom1();
		sm.reverseWords();
		sm.reversechar();
		sm.averageofStudentMarks();
		sm.reversechar1();

	}

}

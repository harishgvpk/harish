package strings_arrays;

public class String_Methods {

	public static void main(String[] args) {

		String string = "Object Oriented programming";
		String string1 = "java";

		int i = string.length();
		System.out.println("length of the string is ==>" +i);

		String s = string1.concat(string);
		System.out.println(s);

		System.out.println(string.charAt(5));

		System.out.println(string.compareTo(string1));

		System.out.println(string1.indexOf(string));

		System.out.println(string1.lastIndexOf("v"));

		System.out.println(string.indexOf("n"));

		System.out.println(string.indexOf(9, 4));

		boolean b = string.equalsIgnoreCase(string1);
		System.out.println(b);

		System.out.println(string1.isEmpty());

		String ss = string1.replace("a", "A");
		System.out.println("new string is   " +ss);

		System.out.println(string1.replaceAll("java", "JAVA"));

		System.out.println(string.startsWith("b"));

		System.out.println(string.endsWith("g"));

		String s1 = string.intern();
		System.out.println("intrened string is   " +s1);

		String[] str = string.split("\\s");
		for(String w:str){  
			System.out.println(w);  
		}  

		String[] str1=  string.split("a", 0); 
		for (String w : str1) {  
			System.out.println(w);  
		}
		
		System.out.println("substring is ===>>" +string.substring(7));
		
		String uppercase = string.toUpperCase();
		System.out.println("uppercase string is ===>>>" +uppercase);
		
		

	}

}

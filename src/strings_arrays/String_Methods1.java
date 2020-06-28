package strings_arrays;

public class String_Methods1 {
	
	

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Object Oriented ");
		sb.append("programming");
		System.out.println(sb);
		
		sb.insert(7, "java ");
		System.out.println(sb);
		sb.delete(3, 9);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println("reversed string is   " +sb);
		sb.capacity();
		System.out.println(sb.capacity());
		
		StringBuilder sbuilder = new StringBuilder("java");  
		sbuilder.append(" program ");
		System.out.println(sbuilder);
		
		sbuilder.deleteCharAt(2);  
		System.out.println(sbuilder);
	}

}

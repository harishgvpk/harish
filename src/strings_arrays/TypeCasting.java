package strings_arrays;

public class TypeCasting {

	public void typeCasting() {

		int i = 45;
		long lng =(long)i;
		System.out.println("int value is ==>" +lng);
		double db = (double)i;
		System.out.println("double value is ==>" +db);
		float flt = (float)i;
		System.out.println("float value is ==>" +flt);
		byte b = (byte)i;
		System.out.println("byte value is" +b);
		
	}

	public void typeCasting1() {
		int i = 8;
		System.out.println("integer value is: " + i);
		String string = String.valueOf(i);
		System.out.println("string value is: " + string);
		String s = "7";
		int number = Integer.parseInt(s);
		System.out.println("int value is" +number );
		long lng = Long.parseLong(s);
		System.out.println("long value is" +lng );
		float f = Float.parseFloat(s);
		System.out.println("float value is" +f );
		double dbl = Double.parseDouble(s);
		System.out.println("double value is" +dbl );
	}

	public static void main(String[] args) {

		double d = 4.56;  

		long l = (long)d; 
		System.out.println("Long value ==> "+l);  
		int i = (int)l;  
		System.out.println("Int value ==>"+i);
		float f = (float)d;
		System.out.println("float value is ==>" +f);

		TypeCasting typeCasting = new TypeCasting();
		//typeCasting.typeCasting();
		typeCasting.typeCasting1();
	}
}

package strings_arrays;

public class Classes {

	private int value=3;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	 static int sum(int x, int y) {
	      int a = 5 ;
		int b = 6;
		int sum= a+b;
		return sum ;
	   }
	public static void main(String args[]){
		Classes c = new Classes();
		System.out.println(c.getValue());
		
		System.out.println(sum(8,9));
	}

}

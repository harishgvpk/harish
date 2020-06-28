package strings_arrays;

public class Sample2 {

	private int a;
	private String name;
	private int avrg;
	Sample2(){
		this(10);
		this.add();
	}
   Sample2(int a){
		this.a=a;
	}
   public void add() {
	   System.out.println(a);
   }
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {

		//System.out.println("hello1");
        Sample2 s = new Sample2();
        s.setName("harish");
        System.out.println(s.getName());
        
	}

}

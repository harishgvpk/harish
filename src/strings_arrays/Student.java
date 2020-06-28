package strings_arrays;

public class Student extends Teacher {
	
	int marks;
	int x;
	
	Student(){
		System.out.println("sub class");
	}
	Student(int a,int b){
		super(a);
		x=b;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	public void information() {
		System.out.println("sub class" +x);
		System.out.println("super class"+super.x);
		super.information();
	}

}

package strings_arrays;

public class Teacher {
	protected int x;

	int id  ;
	String name;
	double salary;
	 
	Teacher(){
		System.out.println("super class");
	}
	Teacher(int x){
		this.x=x;
	}
	public void setId(int id) {
		 this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public void information() {
		System.out.println("super class" +x);
	}
	
}

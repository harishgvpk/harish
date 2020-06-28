package strings_arrays;

public class Person {
	private String name;
	private int age;
	public Person(String n, int a){
		name=n;
		age= a;
	}
	public void walk() {
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		
		Person p = new Person("harish",26);
		//p.name="harish";
		//p.age=26;
		p.walk();
		Person p1 = new Person("venkat",30);
		p1.walk();

	}

}

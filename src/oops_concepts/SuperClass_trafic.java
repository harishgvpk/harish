package oops_concepts;

public class SuperClass_trafic {
	
	String insurence;
	
	public void red() {
		System.out.println("vehicle should stop");
	}
	public void yellow() {
		System.out.println("vehicle ready to go");
	}
	public void green() {
		System.out.println("vehicle should go");
	}
	public void india() {
		System.out.println("parent class__Left side driving");
	}
	
	public void setInsurence(String insurence) {
		this.insurence=insurence;
	}
	public String getInsurence() {
		return insurence;
	}
}

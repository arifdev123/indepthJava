package co.in.javacoder.indepthjava.inheritance.ploymorphism.demo;

public class Staff extends User {
	public void printUserType() {
		System.out.println("Staff");
	}
	
	public void postAReview() {
	   System.out.println("Staff: postAReview");
	}
}
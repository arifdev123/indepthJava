package co.in.javacoder.indepthjava.inheritance.assignment;

public class Staff extends User {

	private long staffid;
	private int yearsOfExperiance;
	private String description;
	private double salary;

	public long getStaffid() {
		return staffid;
	}

	public void setStaffid(long staffid) {
		this.staffid = staffid;
	}

	public int getYearsOfExperiance() {
		return yearsOfExperiance;
	}

	public void setYearsOfExperiance(int yearsOfExperiance) {
		this.yearsOfExperiance = yearsOfExperiance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

package co.in.javacoder.indepthjava.inheritance.assignment;

public class Doctor extends Staff {

	private long dotorid;
	private String specialization;

	public long getDotorid() {
		return dotorid;
	}

	public void setDotorid(long dotorid) {
		this.dotorid = dotorid;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}

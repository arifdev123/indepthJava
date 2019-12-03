package co.in.javacoder.indepthjava.inheritance.assignment;

import co.in.javacoder.indepthjava.inheritance.ploymorphism.assignment.HealthInsurancePlan;

public class Patient extends User {

	private long patientId;
	private boolean insured;
	private HealthInsurancePlan insurancePlan;

	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public boolean isInsured() {
		return insured;
	}

	public void setInsured(boolean insured) {
		this.insured = insured;
	}

}
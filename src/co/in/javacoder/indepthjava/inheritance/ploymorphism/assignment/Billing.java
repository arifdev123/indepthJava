package co.in.javacoder.indepthjava.inheritance.ploymorphism.assignment;

import co.in.javacoder.indepthjava.inheritance.assignment.Patient;

public class Billing {
	
	 public static double[] computePaymentAmount(Patient patient, double amount) {
	        double[] payments = new double[2];
	        
	        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

	        // your logic    
	        if(patientInsurancePlan != null) {
	        	
	        	if(patientInsurancePlan instanceof PlatinumPlan) {
	        		payments[0] = amount * ((PlatinumPlan)patientInsurancePlan).getCoverage();
	        		payments[1] = (amount - ( payments[0] + 50));
	        	} else if(patientInsurancePlan instanceof GoldPlan) {
	        		payments[0] = amount * ((GoldPlan)patientInsurancePlan).getCoverage();
	        		payments[1] = (amount - ( payments[0] + 40));
	        	} else if(patientInsurancePlan instanceof SilverPlan) {
	        		payments[0] = amount * ((SilverPlan)patientInsurancePlan).getCoverage();
	        		payments[1] = (amount - ( payments[0] + 30));
	        	} else if(patientInsurancePlan instanceof BronzePlan) {
	        		payments[0] = amount * ((BronzePlan)patientInsurancePlan).getCoverage();
	        		payments[1] = (amount - ( payments[0] + 25));
	        	}
	        	
	        } else {
	        	payments[0] = 0;
        		payments[1] = amount - 20;
	        }

	        return payments;
	    }

}

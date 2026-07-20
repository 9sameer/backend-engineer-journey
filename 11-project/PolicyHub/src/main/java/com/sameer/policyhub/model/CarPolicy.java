package com.sameer.policyhub.model;

public class CarPolicy extends Policy {

    public CarPolicy(String policyId,
                     String policyName,
                     double premium,
                     double coverageAmount) {

        super(policyId,
                policyName,
                premium,
                coverageAmount);
    }

    @Override
    public void calculatePremium() {

        System.out.println("Car Policy Premium Calculated");

    }

}
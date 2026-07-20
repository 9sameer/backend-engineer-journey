package com.sameer.policyhub.model;

public class HealthPolicy extends Policy {

    public HealthPolicy(String policyId,
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

        System.out.println("Health Policy Premium Calculated");

    }

}
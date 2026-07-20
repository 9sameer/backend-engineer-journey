package com.sameer.policyhub.model;

public class LifePolicy extends Policy {

    public LifePolicy(String policyId,
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

        System.out.println("Life Policy Premium Calculated");

    }

}
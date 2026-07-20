package com.sameer.policyhub.model;

public abstract class Policy {

    private String policyId;
    private String policyName;
    private double premium;
    private double coverageAmount;

    public Policy(String policyId,
                  String policyName,
                  double premium,
                  double coverageAmount) {

        this.policyId = policyId;
        this.policyName = policyName;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public double getPremium() {
        return premium;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public abstract void calculatePremium();

    @Override
    public String toString() {

        return "Policy ID : " + policyId +
                "\nPolicy Name : " + policyName +
                "\nPremium : " + premium +
                "\nCoverage : " + coverageAmount;
    }
}
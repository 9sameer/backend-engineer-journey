package com.sameer.policyhub.model;

public class Policy {

    private String policyId;

    private String policyName;

    public Policy(String policyId,
                  String policyName) {

        this.policyId = policyId;
        this.policyName = policyName;

    }

    @Override
    public String toString() {

        return policyId + " " + policyName;

    }

}
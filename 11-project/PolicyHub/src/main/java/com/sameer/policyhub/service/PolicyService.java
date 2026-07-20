package com.sameer.policyhub.service;

import com.sameer.policyhub.model.Policy;

public interface PolicyService {

    void addPolicy(Policy policy);

    void viewPolicies();

    Policy findPolicyById(String policyId);

    boolean deletePolicyById(String policyId);

    boolean updatePremium(String policyId, double newPremium);
}
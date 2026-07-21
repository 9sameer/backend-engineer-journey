package com.sameer.policyhub.service;

import com.sameer.policyhub.model.Policy;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PolicyServiceImpl implements PolicyService {
    private List<Policy> policies = new ArrayList<>();

    @Override
    public void addPolicy(Policy policy) {
        policies.add(policy);
        System.out.println("Policy Added Successfully.");
    }

    @Override
    public void viewPolicies() {
        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println("---------------------------");
        }
    }

    @Override
    public Policy findPolicyById(String policyId) {

        for (Policy policy : policies) {
            if (policy.getPolicyId().equals(policyId)) {
                return policy;
            }
        }
        return null;
    }

    @Override
    public boolean deletePolicyById(String policyId) {
        // Is this method correct --> No, Sometime it will work sometimes it won't. It can give ConcurrentModificationException
        //WHY?  --> for-each internally Iterator use karta hai. Aur tu usi list ko modify kar raha hai. Ye unsafe hai.
       /*
       for (Policy policy : policies) {
            if (policy.getPolicyId().equals(policyId)) {
                return policies.remove(policy);
            }
        }
        */

//        Correct Way :>> Use Iterator
        Iterator<Policy> iterator = policies.iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next();
            if (policy.getPolicyId().equals(policyId)) {
                iterator.remove();
                return true;
            }
        }


        return false;
    }


    @Override
    public boolean updatePremium(String policyId, double newPremium){
        for (Policy policy : policies) {
            if (policy.getPolicyId().equals(policyId)) {
                policy.setPremium(newPremium);
                return true;
            }
        }

    return false;
    }

}

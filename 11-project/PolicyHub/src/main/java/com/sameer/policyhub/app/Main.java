package com.sameer.policyhub.app;

import com.sameer.policyhub.model.CarPolicy;
import com.sameer.policyhub.model.HealthPolicy;
import com.sameer.policyhub.model.LifePolicy;
import com.sameer.policyhub.model.Policy;
import com.sameer.policyhub.service.PolicyService;
import com.sameer.policyhub.service.PolicyServiceImpl;

public class Main {

    public static void main(String[] args) {

        PolicyService service = new PolicyServiceImpl();

        service.addPolicy(new HealthPolicy("P101", "Health Shield", 2500, 500000));

        service.addPolicy(new CarPolicy("P102", "Car Protect", 3000, 700000));
        service.addPolicy(new LifePolicy("P103", "Health Shield", 1800, 1200000));

        service.viewPolicies();


//        HealthPolicy policy = new HealthPolicy("P101", "Health Shield", 2500, 500000);
//        System.out.println(policy);
//        policy.calculatePremium();

        Policy policy = service.findPolicyById("P101");
        if (policy != null) {
            System.out.println(policy);
        } else {
            System.out.println("Policy Not Found");
        }


        boolean deleted = service.deletePolicyById("P101");
        if (deleted) {
            System.out.println("Policy Deleted");
        } else {
            System.out.println("Policy Not Found");
        }
        service.viewPolicies();



    }

}
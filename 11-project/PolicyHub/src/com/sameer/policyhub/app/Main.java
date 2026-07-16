package com.sameer.policyhub.app; // 1. Main class ka apna package

import com.sameer.policyhub.model.Policy; // 2. Policy class ka import 🚀

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();

        policies.add(new Policy("P101", "Health"));

        policies.add(new Policy("P102", "Car"));

        System.out.println(policies);

    }
}
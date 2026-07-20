package com.sameer.policyhub.practice; // Tere package path ke hisab se

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        // 1. Creates an ArrayList<String>
        ArrayList<String> names = new ArrayList<>();

        // 2. Adds 5 names (Initial capacity 0 se sidha 10 ho jayegi yahan)
        names.add("Sameer");
        names.add("Ali");
        names.add("Amit");
        names.add("Rahul");
        names.add("Vikram");

        // 3. Prints size()
        System.out.println("Total elements in list (size): " + names.size());
        System.out.println("-------------------------------------");

        // 4. Prints them using: Normal for loop
        System.out.println("Printing using Normal For Loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }
        System.out.println("-------------------------------------");

        // 5. Prints them using: Enhanced for loop (ForEach)
        System.out.println("Printing using Enhanced For Loop:");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
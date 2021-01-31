package com.javaclasez.banking.simple.scratch;

import java.util.Date;

public class StringFormatExamples {
    public static void main(String[] args) {
        String s = new String();
//
//        String fName = "John";
//        String lName = "David";
//
//        System.out.println("I got last name '" + lName + "', and first name '" + fName + "'");
//
//        String output = String.format("I got last name '%s' and first name '%s'", lName, fName);
//        System.out.println(output);

        // Lets create a table of firstName and lastName

        String[] fNames = { "John", "David", "Sam", "Venkateshwara"};
        String[] lNames = { "Michels", "Attenborough", "Willington", "Rao" };
        int[] ages = {40, 80, 30, 25 };
        float[] interestRates = { 1.25f, 2.01f, 0.08f, 0.01f };

//        System.out.println(String.format("%-20s  %-20s %-5s", "FIRST NAME", "LAST NAME", "AGE"));
//        for (int i=0;  i < fNames.length; i++) {
//            // System.out.println(String.format("%10s  %s", fNames[i],lNames[i]));
//            System.out.println(String.format("%-20s  %-20s  %d %f", fNames[i], lNames[i], ages[i], interestRates[i]));
//        }
//
//        System.out.println("----");
//        String temp = "Temp Name";
//        System.out.println("Name " + temp);
//
//        Person p = new Person();
//        p.setFirstName("John");
//        p.setLastName("David");
//        p.setAge(30);
//
//        System.out.println(p);
//        System.out.println(p.toString());

        long lt = System.currentTimeMillis() + 144000000;
        Date future = new Date(lt);

        System.out.println(new Date());
        System.out.println(String.format("%tA", new Date()));
        System.out.println(String.format("%ta", new Date()));
        System.out.println(String.format("%td", future));
        System.out.println(String.format("%te", future));
        System.out.println(future);

    }
}

package com.example.introtooopinjava;

public class Manager extends Employee {


        /*
        ---Video 37 ---
        ===Overriding Super Class Method===
         */
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 10000;
    }
}

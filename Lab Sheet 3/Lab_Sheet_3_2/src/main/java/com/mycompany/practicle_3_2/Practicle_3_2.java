package com.mycompany.practicle_3_2;

public class Practicle_3_2 {

    public static void main(String[] args) {
        var employee1 = new Employee(10000);
        employee1.setEmployeeName("Bogdan");
        employee1.setBasicSalary(50000);
        
        System.out.println("Employee Name: "+employee1.getEmployeeName()); 
        System.out.println("Basic Salary: "+employee1.getBasicSalary()); 
        System.out.println("Bonus: "+employee1.getBonus()); 
        System.out.println("Bonus amount: "+employee1.calculateBonus()); 
    }
}

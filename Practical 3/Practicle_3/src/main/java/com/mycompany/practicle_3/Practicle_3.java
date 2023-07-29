package com.mycompany.practicle_3;

public class Practicle_3 {

    public static void main(String[] args) {
        /*
        var employee1 = new Employee("Navidnu",21,50000);
        
        System.out.println("Employee Name: "+employee1.getEmployeeName());
        System.out.println("Age: "+employee1.getAge());
        System.out.println("Salary: "+employee1.getSalary());
        */
        
        var employee2 = new Employee_2();
        employee2.setEmployeeName("Navidnu");
        employee2.setSalary(50000);
        employee2.setAge(21);
        
        System.out.println("Employee Name: "+employee2.getEmployeeName());
        System.out.println("Age: "+employee2.getAge());
        System.out.println("Salary: "+employee2.getSalary());
            
    }
}

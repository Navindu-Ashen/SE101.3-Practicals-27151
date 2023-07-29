package com.mycompany.practicle_3;

public class Employee {
    private String employeeName;
    private int age;
    private float salary;
    
    public Employee(String employeeName, int age, float salary){
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public int getAge(){
        return age;
    }
    public float getSalary(){
        return salary;
    }
    
    
}

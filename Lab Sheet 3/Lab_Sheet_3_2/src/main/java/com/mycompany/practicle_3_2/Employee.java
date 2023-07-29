package com.mycompany.practicle_3_2;

public class Employee {
    private String employeeName;
    private int basicSalary;
    private int bonus;
    
    public Employee(int bonus){
        this.bonus = bonus;
    }
    
    public void setBasicSalary(int basicSalry){
        this.basicSalary = basicSalry;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public int getBasicSalary(){
        return basicSalary;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public int getBonus(){
        return bonus;
    }
    
    public int calculateBonus(){
        int bonusAmount;
        bonusAmount = basicSalary + bonus;
        return bonusAmount;
    }
}

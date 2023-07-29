package com.mycompany.practicle_1;

public class Practicle_1_5 {
    public static void main(String[] args) {
        char grade = 'D';
        if(grade == 'A')
            System.out.println("Exellent!");
        else if(grade == 'D')
            System.out.println("You passed");
        else if(grade == 'F')
            System.out.println("Better try again");
        else
            System.out.println("Invalid grade");
        
        System.out.println("Your grade is "+grade);
    }
}

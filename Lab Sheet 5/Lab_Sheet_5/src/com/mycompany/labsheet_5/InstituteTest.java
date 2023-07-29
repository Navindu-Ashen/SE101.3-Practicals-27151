package com.mycompany.labsheet_5;

public class InstituteTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("SHTFernando");
        student1.setID(123);
        student1.setCourse("Computer Science");

        Lecturer lecturer1 = new Lecturer();
        lecturer1.setName("Mohamed Sarfraz");
        lecturer1.setID(456);
        lecturer1.setProg("OOP with JAVA");

        System.out.println("Student: " + student1.getName());
        System.out.println("ID: " + student1.getID());
        System.out.println("Course:  "+ student1.getCourse());

        System.out.println("Lecturer: " + lecturer1.getName());
        System.out.println("ID: " + lecturer1.getID());
        System.out.println("Programme: " + lecturer1.getProg());
    }

}

package com.Lab_ex_02;

public class ShapePerimeter {
    public static void main(String[] args){
        var circle1 = new Circle(7);
        System.out.println("Circle perimeter: "+circle1.calculatePerimeter());
        System.out.println("Circle area: "+circle1.calculateArea());

        var rectangle1 = new Rectangle(5,6);
        System.out.println("Rectangle Perimeter: "+rectangle1.calculatePerimeter());
        System.out.println("Rectangle area: "+rectangle1.calculateArea());

        var triangle1 = new Triangle(8);
        System.out.println("Triangle Perimeter: "+triangle1.calculatePerimeter());
        System.out.println("Triangle area: "+triangle1.calculateArea());
    }
}

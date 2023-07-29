package com.practicle_5_4;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }
}

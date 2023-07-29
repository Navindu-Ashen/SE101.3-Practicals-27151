package com.practicle_5_4;

public abstract class Shape {
    abstract double calculateArea();

    public void display(){
        System.out.println("Area: "+calculateArea());
    }
}

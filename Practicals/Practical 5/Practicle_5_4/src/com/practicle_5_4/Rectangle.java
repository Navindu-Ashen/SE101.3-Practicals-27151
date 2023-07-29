package com.practicle_5_4;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return height*width;
    }
}

package com.Lab_ex_02;

public class Rectangle implements Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return (length+width)*2;
    }

    @Override
    public double calculateArea() {
        return  length*width;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}

package com.Lab_ex_02;

import java.lang.ref.Cleaner;

public class Triangle implements Shape{
    private int length;

    public Triangle(int length){
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return length*3;
    }

    @Override
    public double calculateArea() {
        return (length*length)/2;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}

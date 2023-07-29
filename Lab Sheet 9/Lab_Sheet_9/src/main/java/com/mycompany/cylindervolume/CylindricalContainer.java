package com.mycompany.cylindervolume;

public class CylindricalContainer extends Container {
    private double height;
    private double radius;
    
    public CylindricalContainer(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    @Override
    public String volume(){
        double volume = Math.PI*radius*radius*height;
        String result = String.format("%.2f", volume);
        return result;
    }
    
}

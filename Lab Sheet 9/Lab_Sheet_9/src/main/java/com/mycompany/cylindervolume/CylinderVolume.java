package com.mycompany.cylindervolume;

public class CylinderVolume {

    public static void main(String[] args) {
        var cylinder1 = new CylindricalContainer(7F,5F);
        System.out.println("Volume: "+cylinder1.volume());
    }
}

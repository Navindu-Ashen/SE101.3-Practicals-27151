package com.mycompany.labsheet_5_2;

public class Dog extends Mamal {
    public static void main(String args[]) {
        Animal a = new Animal();
        Mamal m = new Mamal();
        Dog d = new Dog();
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mamal);
        System.out.println(d instanceof Animal);

    }
}

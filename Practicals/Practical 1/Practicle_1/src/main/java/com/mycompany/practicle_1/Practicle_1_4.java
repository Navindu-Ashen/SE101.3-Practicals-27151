package com.mycompany.practicle_1;

public class Practicle_1_4 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x >= 30) {
                continue;
            }
            System.out.println(x);
        }
        System.out.print("I’m out of the Loop now");

    }
}

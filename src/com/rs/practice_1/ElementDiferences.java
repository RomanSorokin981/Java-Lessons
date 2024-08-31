package com.rs.practice_1;

public class ElementDiferences {
    public static void main(String[] args){
        int[] array = new int[]{1, 2, 3, 5, 1, 60};
        int difference = 0;
        for (int i = 0; i < array.length; i++) {
            difference -=  array[i];

        }
        System.out.println(difference);
    }
}

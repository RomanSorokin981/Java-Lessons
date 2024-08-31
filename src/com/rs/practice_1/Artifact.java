package com.rs.practice_1;

public class Artifact {

    public static void main (String[] args) {
        int i = 0;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        do{
            System.out.println(array[i]);
            i++;
        }while (i < array.length);

    }

}

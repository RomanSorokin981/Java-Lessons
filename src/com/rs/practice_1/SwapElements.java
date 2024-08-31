package com.rs.practice_1;

public class SwapElements {
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 2, 1, 9};
        int firstElemnt = array[0];
        array[0] = array[array.length -1];
        array[array.length - 1] = firstElemnt;
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}

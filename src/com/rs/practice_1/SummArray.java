package com.rs.practice_1;

public class SummArray {
    public static void main(String[] args) {
        int[] array = new int[]{2,4, 2};
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result = result * array[i];
        }

        System.out.println(result);
    }

}

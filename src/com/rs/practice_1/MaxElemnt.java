package com.rs.practice_1;

public class MaxElemnt {
    public static void main(String[] args) {
        int[] array = new int[]{-1,-2,-10,-4,-125,-240, 200};
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println(maxElement);
    }
}


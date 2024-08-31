package com.rs.practice_1;

public class AvarageElement {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 11};
        int arraySum = 0;
        for (int i = 0; i < array.length; i++){
            arraySum += array[i];
        }
        double avg = (double) arraySum / array.length;
        System.out.println(avg);

    }
}

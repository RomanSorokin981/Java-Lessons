package com.rs.practice_1;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int[] array = new int[]{-1, -2, -3, 0, 1, 2, 3};
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                positive++;
            }else if (array[i] < 0){
                negative++;
            }
        }
        System.out.println("Positive count = " + positive + " Negative count = " + negative);

    }
}

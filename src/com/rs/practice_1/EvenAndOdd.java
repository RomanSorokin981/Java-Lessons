package com.rs.practice_1;

public class EvenAndOdd {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++ ){
            if (array[i] % 2 == 0){
                countEven++;
            }else {
                countOdd++;
            }
        }
        System.out.println("even = " + countEven + " odd = " + countOdd);

    }
}

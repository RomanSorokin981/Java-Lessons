package com.rs.practice_3;

import java.util.Scanner;

public class FindElementAndReturnId {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,5,3,4, 4,6,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        int numberToFind = input.nextInt();
        int result = returnIndex(array, numberToFind);
        System.out.println(result);
    }

    private static int returnIndex(int[] array, int numberToFind) {
        for(int i = 0; i < array.length; i++){
            if (array[i] == numberToFind){
                return i;
            }
        }

        return -1;
    }

}

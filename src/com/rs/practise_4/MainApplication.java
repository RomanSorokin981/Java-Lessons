package com.rs.practise_4;



public class MainApplication {


    public static void miniMaxSum(int[] arr) {

        int total = 0;
        int minElement = arr[0];
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }

            total += arr[i];

            if (arr[i] > minElement) {
                maxElement = arr[i];
            }

        }

        int sumWithoutMax = total - maxElement;
        int sumWithoutMin = total - minElement;

        System.out.println(minElement);
        System.out.println(maxElement);


        System.out.println(sumWithoutMax);
        System.out.println(sumWithoutMin);

    }

    public static void main(String[] args) {

        int[] array = new int[]{1,3,5,7,9};
         miniMaxSum(array);

    }


}




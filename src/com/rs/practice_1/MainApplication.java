package com.rs.practice_1;

import java.util.Scanner;

public class MainApplication {

   public String value = "value";

    public static void main(String[] args) {
       System.out.println("hello Maks");
       String roman = "sorokin";
       System.out.println(roman);
       int luckScore = 100;
       int multiplier = 100;
       int currentResult = luckScore * multiplier;
       System.out.println(currentResult);

       int a = 10;
       boolean romanIsBig = true;
       Integer b = 15;
//       Car opel = new Car();
       Scanner scan = new Scanner(System.in);
       System.out.println("Provide first input ");
       int firstInput = scan.nextInt();
       System.out.println("Provide second input ");
       int secondInput = scan.nextInt();
       int sumOfBothValues = firstInput + secondInput;
       if (sumOfBothValues < 20 && sumOfBothValues > 40) {
          System.out.println("less than 20");
       } else if (sumOfBothValues < 40) {
          System.out.println("less than 40");
       } else {
          System.out.println("More than 20");
       }
       int[] array = new int[] {1,2,3};
       int[] secondArray = new int[10];
       array[0] = 110;
       for (int i = 0; i < 3; i--) {
          System.out.println("i = " + i);
          System.out.println(array[i]);
       }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = i + 1;
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }

        int value = 1;
        value = value + 1;
//        value + 1;
        value++;
        value+=1;
    }


}

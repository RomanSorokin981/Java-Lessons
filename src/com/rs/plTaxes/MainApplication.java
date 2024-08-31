package com.rs.plTaxes;

import java.sql.Array;
import java.util.List;

public class MainApplication {
    // arr = [1, 1, 0, -1, -1]
    public static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                positive++;
            }else if (arr[i] == 0){
                zero++;
            }else {
                negative++;
            }
        }

        double positiveRatio = positive / arr.length;
        double negativeRatio = negative / arr.length;
        double zeroRatio = zero / arr.length;


        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);




    }
    public static void main(String[] args) {

        int[] array = new int[]{1, 1, 0, -1, -1};
        plusMinus(array);

        TaxCalculator result = new TaxCalculator();
        double bruttoYearIncome = 125000;
        System.out.println("Your outcome is a " + result.generalTax(bruttoYearIncome) + " PLN");
        System.out.println("Your outcome is a " + result.flatTaxRate(bruttoYearIncome) + " PLN");
        System.out.println("Your outcome is a " + result.rychalt12(bruttoYearIncome) + " PLN");




    }
}


package com.rs.plTaxes;

public class TaxCalculator {



    public static double generalTax(double bruttoYearIncome){
        double netoYearOutcome;
        if (bruttoYearIncome <= 30000){
            netoYearOutcome = bruttoYearIncome;}

        else if (bruttoYearIncome <= 120000) {
            netoYearOutcome = bruttoYearIncome * 0.83;
        }

        else {
            netoYearOutcome = bruttoYearIncome * 0.68;
        }
        return netoYearOutcome;
    }

    public static double flatTaxRate(double bruttoYearIncome){
        return bruttoYearIncome * 0.81;
    }

    public static double rychalt12(double bruttoYearIncome){
        return bruttoYearIncome * 0.88;
    }

    public static void main(String[] args) {
        TaxCalculator result = new TaxCalculator();
        double bruttoYearIncome = 125000;
        System.out.println("Your outcome is a " + result.generalTax(bruttoYearIncome) + " PLN");
        System.out.println("Your outcome is a " + result.flatTaxRate(bruttoYearIncome) + " PLN");
        System.out.println("Your outcome is a " + result.rychalt12(bruttoYearIncome) + " PLN");


    }
}

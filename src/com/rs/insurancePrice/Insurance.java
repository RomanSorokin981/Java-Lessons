package com.rs.insurancePrice;

public class Insurance {
     public static double getCarInsurancePrice(CarGategory carGategory, IssuedBeforeYear issuedBeforeYear, PermanentParking permanentParking){
         double price = 1000;
         return price * carGategory.getCof() * issuedBeforeYear.getCof() * permanentParking.getCof();
     }



}

package com.rs.insurancePrice;

public class MainApplication {
    public static void main(String[] args) {

        double price = Insurance.getCarInsurancePrice(CarGategory.COMFORT_CAR, IssuedBeforeYear.YEAR_2005, PermanentParking.GARAGE);
        System.out.println(price);

        PermanentParking permanentParking = PermanentParking.PROTECTED_PARKING;
        PermanentParkingWithMethods permanentParkingWithMethods = PermanentParkingWithMethods.PROTECTED_PARKING;

        System.out.println(permanentParkingWithMethods.getCof());
        System.out.println(permanentParking.getCof());

        String ten = "10";
        String twenty = "20";

        ten.equals(twenty);



    }
}

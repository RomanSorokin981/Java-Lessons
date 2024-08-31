package com.rs.assotiation;

public class MainApplication {
    public static void main(String[] args) {
        Person roman = new Person("Roman", 26);
        CreditCard romansCreditCard = new CreditCard();

        roman.setCreditCard(romansCreditCard);
        int a = 10;
        if (a != 10){
            System.out.println("not equal");
        }

        String isValid = a > 10
                ? (a > 15 ? "greater 15" : "lower 15")
                : "false";








//        Car car = new Car();
//        SuperCar superCar = new SuperCar();

//        Car lambo = new SuperCar();
//        SuperCar ferra = new Car();
    }
}

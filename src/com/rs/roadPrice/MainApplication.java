package com.rs.roadPrice;

public class MainApplication {
    public static void main(String[] args) {
        Transport sedan = new Transport(AkkpType.AUTO, TransportType.SEDAN, 10, 1099);
        System.out.println(sedan.RideCost(sedan.getFuelConsumption(), 10, 100, sedan.akpp, sedan.getYearOfIssue(), sedan.getType()));
    }
}

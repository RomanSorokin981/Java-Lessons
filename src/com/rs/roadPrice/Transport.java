package com.rs.roadPrice;


public class Transport {
    public AkkpType akpp;
    private TransportType type;
    private double fuelConsumption;
    private int yearOfIssue;

    public Transport (AkkpType akpp, TransportType type, double fuelConsumption, int yearOfIssue){
        this.akpp = akpp;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
        this.yearOfIssue = yearOfIssue;
    }

    public double RideCost(double fuelConsumption, double oilCost, double distance, AkkpType akkp, int yearOfIssue, TransportType type){
        double fuelCost = fuelConsumption * (distance / 100) * oilCost;


        if (akkp == AkkpType.MANUAL){

        }
        else {
            fuelCost *= 1.1;
        }

        if (yearOfIssue < 2000){
            fuelCost *= 1.1;
        }
        else {
            fuelCost = fuelCost;
        }

        return fuelCost + type.returnAutoBanPrice();


    }
    
    public double getFuelConsumption(){
        return fuelConsumption;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public TransportType getType(){
        return type;
    }
}

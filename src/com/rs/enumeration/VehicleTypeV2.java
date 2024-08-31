package com.rs.enumeration;

public enum VehicleTypeV2 {
    MOTO(5),
    SEDAN(10),
    TRUCK(15);

    int price;

    VehicleTypeV2(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}

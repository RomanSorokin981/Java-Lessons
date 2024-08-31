package com.rs.enumeration;

public class MainApplication {
    public static void main(String[] args) {
        VehicleType moto = VehicleType.MOTO;
        VehicleType truck1 = VehicleType.TRUCK_5T;

        System.out.println(moto.getPrice());
        System.out.println(truck1.getPrice());

        Vehicle vehicle = new Vehicle("BMW", VehicleTypeV2.valueOf("MOTO"));

        VehicleTypeV2 motoV2 = VehicleTypeV2.MOTO;
        System.out.println(vehicle.getPrice());
    }
}

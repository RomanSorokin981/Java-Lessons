package com.rs.OOP;

public class Car {
    private  Engine engine;

    private double speed;

    public Car (Engine engine, double speed){
        this.engine = engine;
        this.speed = speed;

    }

    public String getInfo(){
        return "Car with max speed: " + speed + ", with engine: " + engine.getInfo();
    }
}

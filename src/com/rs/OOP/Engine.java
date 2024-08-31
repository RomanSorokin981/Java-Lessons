package com.rs.OOP;

public class Engine {
    private double volume;

    public Engine(double volume){
        this.volume = volume;
    }

    public String getInfo() {
       return "This is engine info: " + volume;
    }
}

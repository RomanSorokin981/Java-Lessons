package com.rs.practice_1.model;

public class Car {
    public String model;
    public int yearOfIssuing;
    public double maxSpeed;

    public Car(String model) {
        this.model = model;
    }

    public Car(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String model, int yearOfIssuing, double maxSpeed) {
        this.model = model;
        this.yearOfIssuing = yearOfIssuing;
        this.maxSpeed = maxSpeed;
    }

    public void printCar() {
        System.out.println("Car: " + model);
    }

    public void printFullInfo() {
        System.out.println("Full info, model: " + model + " yearOfIssue: " + yearOfIssuing + " maxSpeed: " + maxSpeed);
    }
}

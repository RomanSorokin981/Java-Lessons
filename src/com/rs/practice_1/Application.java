package com.rs.practice_1;

import com.rs.practice_1.model.Car;

public class Application {
    public static void main(String[] args){
        Car opel = new Car("opel");
        opel.printCar();

        Car ford = new Car("ford");
        ford.printCar();

        Car reno = new Car("reno", 2005, 200.40);
        Car honda = new Car(200.60);
        reno.printFullInfo();
        honda.printFullInfo();
    }
}

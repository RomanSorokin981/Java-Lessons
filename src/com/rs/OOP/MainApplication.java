package com.rs.OOP;

public class MainApplication {
    public static void main(String[] args) {
        Engine openEngine = new Engine(1.8);
        Car opel = new Car (openEngine, 190.5);

        Engine civicEngine = new Engine(1.7);
        Car civic = new Car(civicEngine, 200.5);

        System.out.println(civic.getInfo());
        System.out.println(opel.getInfo());
    }
}

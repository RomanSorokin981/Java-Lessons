package com.rs.interfacesAndAbstrackClasses;

import com.rs.assotiation.Car;

public class MainApplication {

    public static void main(String[] args) {
        Cat barsik = new Cat();
        Dog bobik = new Dog();
//        Animal animal = new Animal();
        Car car = new Car();


        barsik.animalIsEating();
        barsik.animalIsSleeping();

        bobik.animalIsEating();
        bobik.animalIsSleeping();

        System.out.println(car);

//        animal.animalIsEating();
//        animal.animalIsSleeping();


    }

}

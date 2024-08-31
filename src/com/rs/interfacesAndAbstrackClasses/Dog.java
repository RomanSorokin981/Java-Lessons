package com.rs.interfacesAndAbstrackClasses;

public class Dog implements Animal {
    @Override
    public void animalIsEating(){
        System.out.println("Dog is eating");
    }

    @Override
    public void animalIsSleeping(){
        System.out.println("Dog is sleeping");
    }
}

package com.rs.interfacesAndAbstrackClasses;

public class Cat implements Animal, Person {

    @Override
    public void animalIsEating(){
        System.out.println("Cat is eating");
    }

    @Override
    public void animalIsSleeping(){
        Person.super.animalIsSleeping();
    }

    @Override
    public void personIsEating() {
        System.out.println("Eating");
    }
}

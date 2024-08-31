package com.rs.interfacesAndAbstrackClasses;

public interface Animal {
    void animalIsEating();

    default void animalIsSleeping(){
        System.out.println("Animal is sleeping");
    }
}

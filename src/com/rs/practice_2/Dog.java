package com.rs.practice_2;

public class Dog extends Animal{
    public void dogIsSleeping(){
        System.out.println("Dog is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}

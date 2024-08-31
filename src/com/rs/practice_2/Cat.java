package com.rs.practice_2;

public class Cat extends Animal{
    public void catIsSleeping(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

}

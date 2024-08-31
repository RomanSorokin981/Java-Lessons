package com.rs.interfaces;

public class Dog implements Animal{
    public void sleep(int hours){
        System.out.println("Dog is sleeping " + hours + " hours" );
    }

    public String eat(){
        return "Dog is eating";
    }
}

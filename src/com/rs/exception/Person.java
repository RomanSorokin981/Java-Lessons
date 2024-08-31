package com.rs.exception;

public class Person {
    private int age;
    private String name;

    public Person (int age, String name){
        if (age < 0){
            throw new RuntimeException("The age can not be less than 0");
        }

        if (name != null && name.length() < 2){
            throw new RuntimeException("Provide valid name");
        }

        this.age = age;
        this.name = name;
    }
}

package com.rs.practice_2;

public class CanVegan {
    public static void main(String[] args) {
        Cat boris = new Cat();
        Dog bim = new Dog();
        Animal[] animalArray = new Animal[]{boris, bim};
        for(int i = 0; i < animalArray.length; i++){
            animalArray[i].eat();
        }
    }
}

package com.rs.practice_2;

public class ClassWithMainMethod {
    public static void main(String[] args) {
        Cat boris = new Cat();
//        boris.catIsSleeping();
//        boris.eat();

        Dog bobik = new Dog();
//        bobik.dogIsSleeping();
//        bobik.eat();

//        Animal dog = new Dog();
//        Animal cat = new Cat();

        Animal[] animals = new Animal[]{boris, bobik};

        for (int i = 0; i < animals.length; i++){
            animals[i].eat();
        }

    }
}

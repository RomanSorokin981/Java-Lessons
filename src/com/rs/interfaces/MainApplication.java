package com.rs.interfaces;

public class MainApplication {


    public static void main(String[] args) {
        Animal barsik = new Cat();
        Animal bobik = new Dog();

        barsik.sleep(9);
        System.out.println(barsik.eat());

        bobik.sleep(15);
        System.out.println(bobik.eat());

        Animal[] animals = new Animal[]{barsik, bobik};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].eat());

            if (i == 0) {
                animals[i].sleep(8);
            } else {
                animals[i].sleep(16);
            }
        }
    }
}

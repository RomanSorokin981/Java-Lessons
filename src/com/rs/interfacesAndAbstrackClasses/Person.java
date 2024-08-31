package com.rs.interfacesAndAbstrackClasses;

public interface Person {
   default void animalIsSleeping(){
       System.out.println("Animal is eating");
   }

   void personIsEating();

}

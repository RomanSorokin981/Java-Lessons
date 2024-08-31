package com.rs.interfaces;

public class Cat implements Animal{
   public void sleep(int hours){
       System.out.println("Cat is sleeping " + hours + " hours" );
   }

   public String eat(){
       return "Cat is eating";
   }
}

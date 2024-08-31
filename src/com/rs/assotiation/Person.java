package com.rs.assotiation;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private CreditCard creditCard;

    public Person (String name, int age){
        if (Objects.nonNull(name) && name.isEmpty()){
            System.out.println("Go v popu scammer");
        }else {
            this.name = name;
        }

        if (age < 18){
            System.out.println("Sorry idi naher");
        }else if(age > 65){
            System.out.println("Sorry you should be younger");
        }else{
            this.age = age;
            System.out.println("We glad to see your money slave");
        }
    }

    public void setCreditCard(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard(){
        return creditCard;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age < 18){
            System.out.println("Sorry idi naher");
        }else if(age > 65){
            System.out.println("Sorry you should be younger");
        }else{
            this.age = age;
            System.out.println("We glad to see your money slave");
        }
    }
}

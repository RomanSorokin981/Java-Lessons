package com.rs.objectMethods;

import java.util.Objects;

public class Computer {
   private String producer;
   private double price;
   private int yearOfIssue;

   public Computer(String producer, double price, int yearOfIssue){
       this.producer = producer;
       this.price = price;
       this.yearOfIssue = yearOfIssue;
   }

   public void setProducer(String producer){
       this.producer = producer;
   }

    public void setPrice(double price){
        this.price = price;
    }

    public void setYearOfIssue(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }

    public String getProducer(){
        return producer;
    }

    public double getPrice(){
        return price;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }

    @Override
    public String toString(){
       return "Your Computer with producer: " + producer + ": The cost is: " + price + " Issued " + yearOfIssue;
    }

    @Override
    public boolean equals(Object object){
       Computer toCompare = (Computer) object;
       boolean isProducerEquals = this.producer.equals(toCompare.producer);
       boolean isPriceEquals = this.price == toCompare.price;
       boolean isYearEquals = this.yearOfIssue == toCompare.yearOfIssue;

        return isProducerEquals && isPriceEquals && isYearEquals;
    }

    @Override
    public int hashCode(){
       return Objects.hash(producer, price, yearOfIssue);
    }
}

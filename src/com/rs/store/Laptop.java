package com.rs.store;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Laptop {
    private int id;
    private String producer;
    private double price;
    private LocalDate dateOfIssue;
    private OsType operationSystem;

    public Laptop (int id, String producer, double price, LocalDate dateOfIssue, OsType operationSystem){
        this.id = id;
        this.producer = producer;
        this.price = price;
        this.dateOfIssue = dateOfIssue;
        this.operationSystem = operationSystem;
    }


    @Override
    public String toString(){
        return "Id: " + id + ", Producer: " + producer + ", Price: " + price + ", Date of issue: " + dateOfIssue + ", Os Type: " + operationSystem;
    }

    public int getId(){
        return id;
    }

    public String getProducer(){
        return producer;
    }

    public double getPrice(){
        return price;
    }

    public LocalDate getDateOfIssue(){
        return dateOfIssue;
    }

    public OsType getOperationSystem(){
        return operationSystem;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOperationSystem(OsType operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

}

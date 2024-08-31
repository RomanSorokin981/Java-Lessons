package com.rs.assotiation;

import java.time.LocalDateTime;

public class CreditCard {
    private String number;
    private int cvv;
    private String holderName;
    private LocalDateTime expirationDate;
    private double limit;

    public void setNumber(String number){
        this.number = number;
    }

    public void setCvv(int cvv){
        this.cvv = cvv;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public void setExpirationDate(LocalDateTime expirationDate){
        this.expirationDate = expirationDate;
    }

    public void setLimit(double limit){
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getNumber() {
        return number;
    }
}

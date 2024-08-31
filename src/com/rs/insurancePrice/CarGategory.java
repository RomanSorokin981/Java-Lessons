package com.rs.insurancePrice;

public enum CarGategory {
    SPORT_CAR(2.5),
    BUISNESS_CAR(2),
    COMFORT_CAR(1.7),
    ECONOM_CAR(1.3);

    final double cof;


    CarGategory(double cof) {
        this.cof = cof;
    }

    public double getCof(){
        return cof;
    }
}

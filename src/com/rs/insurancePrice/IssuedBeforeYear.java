package com.rs.insurancePrice;

public enum IssuedBeforeYear {

    YEAR_2000(2000, 2),
    YEAR_2005(2005, 1.8),
    YEAR_2010(2010, 1.6),
    YEAR_2015(2015, 1.4),
    YEAR_2020(2020, 1.2);

    final int year;
    final double cof;
    IssuedBeforeYear(int year, double cof) {
        this.year = year;
        this.cof = cof;
    }

    public double getCof(){
        return cof;
    }
}

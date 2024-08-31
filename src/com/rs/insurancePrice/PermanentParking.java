package com.rs.insurancePrice;

public enum PermanentParking {
    STREET(1.6),
    GARAGE(1.2),
    PROTECTED_PARKING(1.4);

    final double cof;

    PermanentParking(double cof) {
        this.cof = cof;
    }

    public double getCof(){
        return cof;
    }
}

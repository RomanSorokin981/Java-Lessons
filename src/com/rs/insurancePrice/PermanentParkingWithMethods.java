package com.rs.insurancePrice;

public enum PermanentParkingWithMethods {
    STREET{
        @Override
        public double getCof(){
            return 5;
        }
    },
    GARAGE{
        @Override
        public double getCof(){
            return 10;
        }
    },
    PROTECTED_PARKING{
        @Override
        public double getCof(){
            return 15;
        }
    };

    public double getCof(){
        return 0;
    }
}

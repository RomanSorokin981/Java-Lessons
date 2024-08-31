package com.rs.roadPrice;

public enum TransportType {

    MOTO {
        @Override
        public int returnAutoBanPrice(){
            return 2;
        }
    },

    SEDAN {
        @Override
        public int returnAutoBanPrice(){
            return 5;
        }
    },
    AUTOBUS {
        @Override
        public int returnAutoBanPrice(){
            return 10;
        }
    },
    TRACK {
        @Override
        public int returnAutoBanPrice(){
            return 15;
        }
    };

    public abstract int returnAutoBanPrice();
}

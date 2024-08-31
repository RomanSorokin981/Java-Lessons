package com.rs.enumeration;

public enum VehicleType {
    MOTO {
        @Override
        public int getPrice() {
            return 5;
        }
    },
    SEDAN,
    TRUCK_5T {
        @Override
        public int getPrice() {
            return 10;
        }
    },
    TRUCK_10T {
        @Override
        public int getPrice() {
            return 15;
        }

    },

    TRUCK_15T {
        @Override
        public int getPrice() {
            return 20;
        }
    };

    public int getPrice() {
        return 0;
    }

}

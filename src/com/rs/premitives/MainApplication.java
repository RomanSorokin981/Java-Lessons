package com.rs.premitives;

public class MainApplication {
    public static void main(String[] args) {
        int a = 10;
        Integer ab = a; // Integer av = new Integer(a); - AutoBoxing

        Integer b = 10; // - AutoBoxing also

        int bu = b; // Unboxing

        int bv = b.intValue();
    }
}

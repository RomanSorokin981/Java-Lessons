package com.rs.practice_3;

public class ClassA {
    private int privateField = 0;
    int defaultField = 1;
    protected int protectedField = 2;
    public int publicField = 3;

    public void test() {
        System.out.println("" + privateField);
        System.out.println("" + defaultField);
        System.out.println("" + protectedField);
        System.out.println("" + publicField);
    }
}

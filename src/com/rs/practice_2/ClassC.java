package com.rs.practice_2;

import com.rs.practice_3.ClassA;

public class ClassC {
    public void test() {
        ClassA notPrivateField = new ClassA();
//        System.out.println("" + notPrivateField.privateField);
//        System.out.println("" + notPrivateField.defaultField);
//        System.out.println("" + notPrivateField.protectedField);
        System.out.println("" + notPrivateField.publicField);
    }
}

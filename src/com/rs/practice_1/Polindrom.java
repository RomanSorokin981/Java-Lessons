package com.rs.practice_1;

public class Polindrom {
    public static void main(String[] args) {
        boolean isPolindrom = true;
        int[] array = new int[]{1, 2, 3, 3, 2, 1};
        for (int i = 0; i < array.length / 2; i++ ){
            if (array[i] != array[array.length - 1 - i]) {
                isPolindrom = false;
            }
        }
        System.out.println(isPolindrom);
    }
}
// 1212
// 1234554321
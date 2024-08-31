package com.rs.practice_1;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide how many years you are in IT ");
        int firstInput = scanner.nextInt();
        if (firstInput <= 2) {
            System.out.println("You are Junior, go and study");
        } else if (firstInput < 5) {
            System.out.println("You are Middle, and you should bring a cofe to your Senior");
        } else {
            System.out.println("Looks like you are Senior - relax and allow your Junior and Middle do everyting instead of you");
        }


    }
}

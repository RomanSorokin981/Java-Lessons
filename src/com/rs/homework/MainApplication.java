package com.rs.homework;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Student roman = new Student("Roman", 22);
        Teacher maxim = new Teacher("Maxim", 39);

        Scanner secondScan = new Scanner(System.in);
        int currentHour = secondScan.nextInt();

        roman.whatThePersonDo(currentHour);
        maxim.whatThePersonDo(currentHour);
        roman.howLongThePersonCanStayInUniversity(roman.personAge);
        maxim.howLongThePersonCanStayInUniversity(maxim.personAge);
    }
}

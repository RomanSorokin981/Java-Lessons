package com.rs.objectMethods;

public class MainApplication {
    public static void main(String[] args) {

        Computer macBook = new Computer("Apple123123123", 1000.00, 2325);
        Computer similarMacBook = new Computer("Apple123123123", 1400.00, 2024);
//        Computer equalMacBook = macBook;
        Computer secondMac = new Computer("Apple123123123", 1000.00, 2325);

        System.out.println(macBook.equals(similarMacBook));
        System.out.println(macBook == similarMacBook);
        System.out.println(macBook);

        System.out.println(macBook.hashCode());
        System.out.println(secondMac.hashCode());

    }
}

package com.rs.store;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Store laptopStore = new Store();

        Scanner laptopScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int input = -1;

        while (input != 0){
            System.out.println("Select the option you want to use");
            System.out.println("Press one to read the items");
            System.out.println("Press 2 to add the item to the store");
            System.out.println("Press 3 to remove the item from the store");
            System.out.println("Press 4 to update the item in the store");
            System.out.println("Press 0 to exit");
            input = scanner.nextInt();

            if (input == 1){
                System.out.println(laptopStore.getItems());
            } else if (input == 2) {
                System.out.println("Enter id");
                int laptopId = laptopScanner.nextInt();

                System.out.println("Enter producer");
                String laptopProducer = laptopScanner.next();

                System.out.println("Enter the price");
                double laptopPrice = laptopScanner.nextDouble();


                System.out.println("Enter the date of issue dd-MM-yyyy");
                String laptopDateOfIssue = laptopScanner.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate dateOfIssue = LocalDate.parse(laptopDateOfIssue, formatter);

                System.out.println("Enter laptop OS (Linux, MacOS, or Windows)");
                String laptopOS = laptopScanner.next().toUpperCase();
                OsType operationSystem = null;
                try {
                    operationSystem = OsType.valueOf(laptopOS);
                } catch (IllegalArgumentException e) {
                    System.out.println("Неверный OS. Попробуйте снова." + e.getMessage());

                }
                Laptop laptop = new Laptop(laptopId, laptopProducer, laptopPrice, dateOfIssue, operationSystem);
                System.out.println("You've successfully added a new laptop into the store " + laptop);
                laptopStore.addItem(laptop);

            } else if (input == 3) {
                System.out.println("Enter id of laptop you want to remove");
                int laptopId = laptopScanner.nextInt();
                laptopStore.removeItem(laptopId);
                System.out.println("The laptop has been removed");
            } else if (input == 4) {
                System.out.println("Enter id");
                int laptopId = laptopScanner.nextInt();

                System.out.println("Enter producer");
                String laptopProducer = laptopScanner.next();

                System.out.println("Enter the price");
                double laptopPrice = laptopScanner.nextDouble();


                System.out.println("Enter the date of issue dd-MM-yyyy");
                String laptopDateOfIssue = laptopScanner.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate dateOfIssue = LocalDate.parse(laptopDateOfIssue, formatter);

                System.out.println("Enter laptop OS (Linux, MacOS, or Windows)");
                String laptopOS = laptopScanner.next().toUpperCase();
                OsType operationSystem = null;
                try {
                    operationSystem = OsType.valueOf(laptopOS);
                } catch (IllegalArgumentException e) {
                    System.out.println("Неверный OS. Попробуйте снова." + e.getMessage());

                }
                Laptop updatedItem = new Laptop(laptopId, laptopProducer, laptopPrice, dateOfIssue, operationSystem);

                laptopStore.updateItem(updatedItem);
                System.out.println("You've successfully updated the item");

            }


        }
}
}

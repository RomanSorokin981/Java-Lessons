package com.rs.exception;

public class MainApplication {

    public static void testA() throws Exception{
        throw new Exception();

    }
    public static void main(String[] args) {
        Person roman = new Person(5, "Roman");
        Person igor = new Person(2, "Idfsd");

        try {
            MainApplication.testA();
        }catch (Exception e){
            System.out.println("Catched");
        }


        try {
//            throw new Exception();
        } catch (Exception e){
            try {
                System.out.println("In catch");
            }catch (IllegalArgumentException a){
                System.out.println("Twice catch");
            }
        }finally {
            System.out.println("in finally");
        }


    }
}

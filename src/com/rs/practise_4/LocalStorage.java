package com.rs.practise_4;

public class LocalStorage implements Storage, UserType{
    @Override
    public void findAll(){
        System.out.println("Finding all files in Local");
    }

    public void findAll(int id){
        System.out.println("Finding all files in Local");
    }

    @Override
    public void upload(){
        System.out.println("Upload file in Local");
    }

    @Override
    public void delete(){
        System.out.println("Delete file in Local");
    }

    public void patch(){
        System.out.println("Patch record");
    }
}

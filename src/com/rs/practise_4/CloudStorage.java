package com.rs.practise_4;

public class CloudStorage implements Storage{

    @Override
    public void findAll(){
        System.out.println("Finding all files in Cloud");
    }

    @Override
    public void upload(){
        System.out.println("Upload file in Cloud");
    }

    @Override
    public void delete(){
        System.out.println("Delete file in Cloud");
    }
}

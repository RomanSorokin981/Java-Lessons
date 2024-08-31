package com.rs.store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Laptop> storage = new ArrayList<>();

    public List<Laptop> getItems(){
        return storage ;
    }

    public void addItem(Laptop item){
        storage.add(item);
    }

    public void removeItem(int id){
        for (int i = 0; i < storage.size(); i++){
            if(id == storage.get(i).getId()){
                storage.remove(storage.get(i));
            }
        }

    }

    public void updateItem(int id, String producer, double price, LocalDate dateOfIssue, OsType operationSystem){

        Laptop updatedItem = new Laptop(id, producer, price, dateOfIssue, operationSystem);
        for (int i = 0; i < storage.size(); i++){
            if(id == storage.get(i).getId()){
                storage.set(i, updatedItem);
            }
        }
    }
}

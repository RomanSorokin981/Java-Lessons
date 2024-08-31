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

    public void updateItem(Laptop updatedItem){


        for (int i = 0; i < storage.size(); i++){
            if(updatedItem.getId() == storage.get(i).getId()){
                storage.set(i, updatedItem);
            }
        }
    }
}

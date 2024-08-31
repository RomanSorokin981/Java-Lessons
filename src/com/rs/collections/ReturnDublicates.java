package com.rs.collections;

import java.util.*;

public class ReturnDublicates {
    public static List<Integer> returnDublicates(List<Integer> input){
        Set<Integer> seenSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for(int i = 0; i < input.size(); i++){
           if (!seenSet.add(input.get(i))){
               secondSet.add(input.get(i));
           }
        }

        return new ArrayList<>(secondSet);
    }

    public static List<Integer> findMinAndMax(List<Integer> input){
        if (input == null || input.isEmpty()){
            System.out.println("Your list is invalid");
            return null;
        }

        int min = input.getFirst();
        int max = input.getFirst();

        for (int i = 0; i < input.size(); i++){
            if (input.get(i) < min){
                min = input.get(i);
            }

            if (input.get(i) > max){
                max = input.get(i);
            }
        }

        return List.of(min, max);
    }

    public static List<Integer> sortList(List<Integer> list){
         Collections.sort(list, Collections.reverseOrder());
         return list;
    }

}

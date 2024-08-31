package com.rs.collections;

import java.util.*;

public class Intersection {
    public static List<Integer> intersection(List<Integer> first, List<Integer> second) {
        HashSet<Integer> result = new HashSet<>() {
        };

        for (Integer integer : second) {
            for (Integer integer1 : first) {
                if (integer.equals(integer1)) {
                    result.add(integer);
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static List<Integer> removeIntersection(List<Integer> list, Set<Integer> set) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer currentElement = iterator.next();
            if (set.contains(currentElement)){
                iterator.remove();
            }
        }
        return list;
    }

    public static List<Integer> getValue(List<Integer> list, int value){
        List<Integer> result = new ArrayList<>();
        for (Integer integer1 : list){
            for (Integer integer2 : list){
                if (integer1 + integer2 == value){
                    result.add(integer1);
                    result.add(integer2);
                    return result;
                }

            }
        }
        return result;
    }

}



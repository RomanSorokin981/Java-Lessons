package com.rs.collections;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
        List<Integer> basicList = new ArrayList<>();
        basicList.add(4);
        basicList.add(2);
        basicList.add(3);
        basicList.add(4);
        basicList.add(2);
        basicList.add(3);
        basicList.add(5);
        basicList.add(2);
        basicList.add(4);
        basicList.add(6);
        basicList.add(2);
        basicList.add(4);

        Set<Integer> basicSet = new HashSet<>();
        basicSet.add(4);
        basicSet.add(2);
        basicSet.add(3);

//        System.out.println(Intersection.removeIntersection(basicList, basicSet));
        System.out.println(Intersection.getValue(basicList, -1));

        Set<Integer> sortedSet = new TreeSet<>(basicSet);
        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(4);
        sortedSet.add(1);

        System.out.println(sortedSet);





//        System.out.println(ReturnDublicates.returnDublicates(basicList));
//        System.out.println(ReturnDublicates.findMinAndMax(new ArrayList<>()));
//        System.out.println(Intersection.intersection(basicList, basicListSecond));


        }

//        Set<Integer> basicSet = new HashSet<>();
//        basicSet.add(10);
//        basicSet.add(40);
//        basicSet.add(20);
//
//        for (Integer integer : basicSet){
//            System.out.println(integer);
//        }


//        System.out.println(basicList.get(2));
//        System.out.println(basicList.size());
//
//        basicList.remove(2);
//
//        System.out.println(basicList.get(1));
//        System.out.println(basicList.size());

//        for (Integer integer : basicList) {
//            System.out.println(integer);
//        }


    }


package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        System.out.println(list.contains(7));
        System.out.print(list.equals(list2));

        System.out.println(list2.hashCode());
        System.out.println("isEmpty() : "+list.isEmpty());
        //list.retainAll(Arrays.asList(3,5,7));
        list.toArray();

        List<Integer> list3 = Arrays.asList(10,11,12,13);

        list.addAll(list3);

        System.out.println(list);
    }
}

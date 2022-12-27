package com.collection.List.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Anu");
        al.add("Ratan");
        al.add("Durga");
        System.out.println("BeforeSorting:"+al);

        Collections.sort(al);
        System.out.println("AfterSorting:"+al);

        System.out.println();
        LinkedList<Integer> L= new LinkedList<>();

        L.add(2);
        L.add(90);
        L.add(1);
        System.out.println(L);
        Collections.sort(L);
        System.out.println(L);
    }

}

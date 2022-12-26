package com.collection.List;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList a1= new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add("A1");
        System.out.println(a1);
        ArrayList a2= new ArrayList(a1);
        a2.add(12);
        a2.add(45);
        a2.add(89);
        System.out.println(a2);

    }
}

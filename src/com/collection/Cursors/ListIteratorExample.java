package com.collection.Cursors;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        //Bidirectional Cursor
        ArrayList<String> al= new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");

        ListIterator ltr=al.listIterator();

        while (ltr.hasNext())
        {
            String str=(String) ltr.next();
            System.out.print(str);
        }
        System.out.println();
        while (ltr.hasPrevious())
        {
            String str1=(String)ltr.previous();
            System.out.print(str1);
        }
    }
}

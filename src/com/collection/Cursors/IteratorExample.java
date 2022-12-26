package com.collection.Cursors;

import com.collection.List.ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // iterator Cursors methods
        //hasNext next remove
        //Iterator has some advantages- It's for all classes, we can remove
        //Disadvantage is we can only move forward with this cursor, with list iterator we can move forward and backward


        ArrayList<String> als = new ArrayList<String>();

        als.add("hjk");
        als.add("ccc");
        als.add("abc");
//  ietrator with normal Version
        Iterator itr = als.iterator();

        while(itr.hasNext())
        {
            String next = (String) itr.next();
            System.out.print(next);
            System.out.print(" ");
        }
        System.out.println();
//  Iterator With Generic Version
        Iterator<String> itGen = als.iterator();

        while (itGen.hasNext())
        {
            String st=itGen.next();
            System.out.print(st);
            System.out.print("  ");
        }

//Enumerator and Iterator are only forward Iterators, ListIterator is a Bidirectional.
    }
}

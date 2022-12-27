package com.collection.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorExample {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();

        al.add("JD");
        al.add("Sid");
        al.add("Am");

        Iterator<String> itr= al.listIterator();

        while (itr.hasNext())
        {
            String str=itr.next();
            if (str=="JD")
            {
                itr.remove();
            }
        }
        System.out.println(al.toString());

    }
}

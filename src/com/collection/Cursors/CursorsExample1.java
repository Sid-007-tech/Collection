package com.collection.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsExample1 {
    public static void main(String[] args) {
        Vector<String> v= new Vector<String>();

        v.add("Sid");
        v.add("Nil");
//  Read the Data by using enumeration: Normal Version
        Enumeration e= v.elements();

        while (e.hasMoreElements())
        {
            String str= (String)e.nextElement();
            System.out.println(str);
        }
//  Read the Data by Using Enumeration : Generic Version

        Enumeration<String> e1 = v.elements();

        while (e1.hasMoreElements())
        {
            String s = e1.nextElement();
            System.out.println(s.toString());
        }
    }
}

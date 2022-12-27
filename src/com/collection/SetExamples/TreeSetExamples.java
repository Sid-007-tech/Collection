package com.collection.SetExamples;

import java.util.TreeSet;

public class TreeSetExamples {
    //In TreeSet Some Sorting Order is maintained
    //only Homogeneous data is stored (Internally uses compareTo() method), null not allowed
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();
        ts.add("d");
        ts.add("c");
        ts.add("a");
        ts.add("j");

        System.out.println(ts);
    }
}

package com.collection.List.Sorting.ComparableExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Emp> ae= new ArrayList<Emp>();

        ae.add(new Emp(222,"JD"));
        ae.add(new Emp(666,"ratan"));
        ae.add(new Emp(333,"Sid"));

        Collections.sort(ae);
        System.out.println(ae);
    }
}

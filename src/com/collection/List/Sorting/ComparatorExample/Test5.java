package com.collection.List.Sorting.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {

    public static void main(String[] args) {
        ArrayList<Emp> ar= new ArrayList<>();

        ar.add(new Emp(555, "Sd"));
        ar.add(new Emp(999, "Ad"));
        ar.add(new Emp(444, "Jd"));

        //sortin with eid
        Collections.sort(ar,new EidComp());

        System.out.println(ar);
        System.out.println();
        //sortin with ename
        Collections.sort(ar,new EnameComp());

        System.out.println(ar);
    }
}

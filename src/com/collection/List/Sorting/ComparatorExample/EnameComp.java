package com.collection.List.Sorting.ComparatorExample;

import java.util.Comparator;

public class EnameComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Emp e1= (Emp) o1;
        Emp e2= (Emp) o2;


        return e1.ename.compareTo(e2.ename);
    }
}

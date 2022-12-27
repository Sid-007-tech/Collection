package com.collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSet1 {
    public static void main(String[] args) {
        TreeSet<Product> ts = new TreeSet<>(new pComp());

        ts.add(new Product(222, "ww"));
        ts.add(new Product(111, "ss"));
        ts.add(new Product(333, "gg"));

        System.out.println(ts);
    }
}

class pComp implements Comparator<Product> {

    private Product p1;
    private Product p2;

    @Override
    public int compare(Product p1, Product p2) {
        this.p1 = p1;
        this.p2 = p2;
        return p1.Pname.compareTo(p2.Pname);
    }
}

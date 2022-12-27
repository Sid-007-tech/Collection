package com.collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("sd");
        hs.add("so");
        hs.add("sf");
        hs.add("sd");
        System.out.println(hs);


        LinkedHashSet<String> lhs= new LinkedHashSet<>();
        lhs.add("sd");
        lhs.add("so");
        lhs.add("sf");
        lhs.add("sd");
        System.out.println(lhs);


        /*with HashSet, Insertion order is not preserved, with LinkedHashSet it*/
    }

}

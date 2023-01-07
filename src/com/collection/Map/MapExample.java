package com.collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm= new HashMap<>();
        hm.put(22,"bb");
        hm.put(33,"cc");
        hm.put(55,"ff");
        hm.put(11,"aa");
        hm.put(55,"ghjj");
        System.out.println(hm);

       Set<Integer> hs = hm.keySet();
        System.out.println(hs);

        Collection<String> C=hm.values();
        System.out.println(C);

       Set<Map.Entry<Integer,String>> es =hm.entrySet();

        for (Map.Entry<Integer, String> e:es) {
            System.out.println(e.getKey()+" == "+e.getValue());
        }

    }
}

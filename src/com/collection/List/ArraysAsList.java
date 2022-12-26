package com.collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {
    public static void main(String[] args) {
        //conversion of array to collection
        String[] str= {"ratan", "madan", "durga"};
        ArrayList<String> al= new ArrayList<String>(Arrays.asList(str));
        al.add("aa");
        al.add("bb");
        al.add("cc");
        System.out.println(al.toString());

        //conversion of collection to array
        ArrayList<String> al2= new ArrayList<String>();
        al2.add("STR1");
        al2.add("STR@");

        String[] tr = new String[al2.size()];

       al2.toArray(tr);

        for (String string:tr) {
            System.out.print(string+" ");
        }


    }
}

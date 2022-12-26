package com.collection.List;

import com.collection.List.ObjectData.Students;

import java.util.ArrayList;

public class AddContainRemoveExamole {
    public static void main(String[] args) {

        Students s1= new Students(1,"gh");
        Students s2= new Students(2,"ew");
        Students s3= new Students(3,"io");

        ArrayList l1= new ArrayList();
         l1.add(1);
         l1.add(2);
         l1.add(3);
         l1.add(s1);
         l1.add(s2);
         l1.add(s3);

        ArrayList l2= new ArrayList();
/*
        l2.add(5);
        l2.add(4);
*/
        l2.addAll(l1);

        System.out.println(l2);
        System.out.println(l2.containsAll(l1));



    }
}

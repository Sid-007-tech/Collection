package com.collection.List.ObjectData;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();

        al.add(new Students(11,"Sid"));
        al.add(new Employee(23,"Mid"));
        al.add("Studenyt");
        al.add(00);
        al.add(10.34);
        System.out.println(al.toString());

        for (Object o:al) {
            if (o instanceof Employee)
            {
                Employee e= (Employee) o;
                System.out.println(" Emp DATA:: "+e.getEid()+"  "+e.getEname() );
            }
            if (o instanceof Students)
            {
                Students st= (Students) o;
                System.out.println(" Student DATA:: "+st.getSid()+"  "+ st.getSname());
            }
            if (o  instanceof String) {
                System.out.println(o);
            }

            // to avoid this type casting of type safety we have a generic concept
        }

    }
}

package com.collection.List.Sorting.ComparableExamples;

import org.jetbrains.annotations.NotNull;

public class Emp implements Comparable<Emp>{
    int eid;
    String ename;

    public Emp(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
    //if we want to perform sorting with ename
    @Override
    public int compareTo(@NotNull Emp o) {
        return ename.compareTo(o.ename);
    }
//if we want to perform sorting with eid
    //this if we want it without generic data
    //if we want to perform sorting with ename then we have to vanish this logic and do sorting based on ename
/*
    @Override
    public int compareTo(@NotNull Object o) {
        Emp e = (Emp) o;

        if (eid == e.eid) {
            return 0;
        } else if (eid > e.eid) {
            return 1;
        } else
            return -1;



    }

 */
}

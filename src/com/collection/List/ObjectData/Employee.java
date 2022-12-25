package com.collection.List.ObjectData;

public class Employee {
    int Eid;
    String Ename;

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public Employee(int eid, String ename) {
        Eid = eid;
        Ename = ename;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eid=" + Eid +
                ", Ename='" + Ename + '\'' +
                '}';
    }
}

package com.collection.List.ObjectData;

public class Students {
    int Sid;
    String Sname;

    public Students(int sid, String sname) {
        Sid = sid;
        Sname = sname;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Sid=" + Sid +
                ", Sname='" + Sname + '\'' +
                '}';
    }
}

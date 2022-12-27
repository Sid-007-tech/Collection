package com.collection.Set;

public class Product {
    int pno;
    String Pname;

    public Product(int pno, String pname) {
        this.pno = pno;
        Pname = pname;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pno=" + pno +
                ", Pname='" + Pname + '\'' +
                '}';
    }
}

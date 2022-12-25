package com.practice;

public class Simple {

    public static int handleException(int n1, int n2)
    {

        System.out.println("We have got two numbers");

        return n1/n2;
        //System.out.println(result);
    }
    public static void main(String[] args) {
       try {
           handleException(20,0);
       }catch (Exception e)
       {
           e.printStackTrace();
           System.out.println(e.getStackTrace());
       }


    }
}
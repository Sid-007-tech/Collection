package com.collection.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookObjectExample {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<Book>();
        book.add(new Book(111,"ratan"));
        book.add(new Book(222,"anu"));
        book.add(new Book(333,"Durga"));

        ListIterator<Book> bitr= book.listIterator();

        while(bitr.hasNext())
        {
            Book Bo=bitr.next();

          /*  if (Bo.getBookId()==111)
            {
                bitr.remove();
            }

            if (Bo.bookName.equals("anu"))
            {
                bitr.remove();
            }*/
        }
        System.out.println(book);


    }
}

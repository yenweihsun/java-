
package day02_array;

import day02.Book;


public class BookArrayTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        b1.name = "JAVA";
        b2.name = "hello";
        b1.setPrice(500);
        b2.setPrice(1000);
        //-------------------
        Book[] books = {b1,b2};
        int total = 0;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
            total += books[i].getPrice();
        }
        //總共花多少錢買書
        System.out.println(total);
        System.out.println(total/books.length);
        
    }
}

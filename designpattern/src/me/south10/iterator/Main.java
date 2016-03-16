package me.south10.iterator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
        
        ArrayList list = new ArrayList(10);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        java.util.Iterator it2 = list.iterator();
        
        while(it2.hasNext()){
        	System.out.println(it2.next());
        }
    }
}


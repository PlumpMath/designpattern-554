package iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
	private ArrayList list;
	
	public BookShelf(int size){
		list = new ArrayList(size);
	}
	
	public void appendBook(Book book){
		list.add(book);
	}
	
	public Book getBookAt(int index){
		return (Book)list.get(index);
	}
	
	public int getLength(){
		return list.size();
	}
	
/*	private Book[] books;
	private int last;
	
	public BookShelf(int size){
		this.books = new Book[size];
		this.last = 0;
	}
	
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	
	public Book getBookAt(int index){
		return this.books[index];
	}
	
	public int getLength(){
		return last;
	}*/
	
	public Iterator iterator(){
		return new BookShelfIterator(this);
	}
}

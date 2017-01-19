package pl.kriss3.lab01;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore 
{
	private ArrayList<Book> books;
	private Book[] myBooks;
	
	public BookStore()
	{
		books = new ArrayList<>();
		myBooks = new Book[5];
		books.add(myBooks[0] = new Book("Zachir",2016,1,3));
		books.add(myBooks[1] = new Book("Delusin",1996,3,15));
		books.add(myBooks[2] = new Book("Fiction",1986,7,19));
		books.add(myBooks[3] = new Book("Marsian",new Date(1567, 5, 13)));
		books.add(myBooks[4] = new Book("Selfish",new Date(1867, 3, 24)));
	}
	
	public void displayBooks()
	{
		Iterator<Book> itr = books.iterator();
		
		System.out.println("Books Repository: \n");
		while(itr.hasNext())
		{
			Book b = itr.next();
			System.out.printf("Title: %s \t Date: %s\n", b.getTitle(), b.getDatePublished().getDate());
		}
		
		System.out.println("\n##########################");
		System.out.println("Let's print some books: \n");
		
		for(Book b1 : books)
		{
			System.out.println("Title: " + b1.getTitle() + "\tDate: " + b1.getDatePublished().getDate());
		}
	}

}

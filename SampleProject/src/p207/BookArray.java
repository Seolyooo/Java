package p207;

import java.util.Scanner;

class Book{
	String title,author;
	public Book(String title, String author) {
		this.title = title;
		this.author= author;
	}
	
}

public class BookArray {

	public static void main(String[] args) {
		Book[] book = new Book[2];
		
		Scanner sc = new Scanner(System.in);
			
		for(int i= 0; i<book.length; i++) {
		System.out.println();
		String title = sc.nextLine();
		System.out.println();
		String author = sc.nextLine();
		book[i] = new Book (title,author);
		}
		
		for(int i= 0; i<book.length; i++)
			System.out.println("("+book[i].title+" "+ book[i].author+")");
		
		sc.close();
	}
	
}

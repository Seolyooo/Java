package p193;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		this.title = t;
		this.author= "작자미상";
	}
	
	public Book(String title,String author){	
		this.author= author;
		this.title=title;
		
	}

	
	public static void main(String[] args) {
		Book lp = new Book("어린왕자","생탣");
		
		Book is = new Book("춘향전");
		
		System.out.println(lp.title+" "+lp.author);
		System.out.println(is.title+" "+is.author);
		
	}
}

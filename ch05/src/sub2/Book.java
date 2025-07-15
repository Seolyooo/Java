package sub2;

public class Book {
	private String title;
	private String auther;
	private String isbn;
	private int availbleCopies;
	
	public Book(String title, String auther, String isbn, int availbleSopies) {
		this.title = title;
		this.auther = auther;
		this.isbn = isbn;
		this.availbleCopies= availbleCopies;
	}
	
	public boolean borrowBook() {
		if(availbleCopies > 0){
			this.availbleCopies -=1;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void returnBook() {
		availbleCopies+=1;
	}
	
	public void show() {
		System.out.println(this.title + this.auther + this.isbn + this.availbleCopies);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getAvailbleCopies() {
		return availbleCopies;
	}
	public void setAvailbleCopies(int availbleCopies) {
		this.availbleCopies = availbleCopies;
	}
}

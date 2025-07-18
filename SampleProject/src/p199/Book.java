package p199;

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title+" "+ author);
	}
	
	public Book() {
		this("", "");
		System.out.println("생성자");
	}
	
	public Book(String title) {
		this(title,"미상");
	}
	
	public Book(String title,String author) {
		this.title = title;
		this.author= author;

	}
	

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","ㅅㅌㅈ");
		Book ls = new Book("춘향전");
		Book empty =new Book();
		ls.show();
		littlePrince.show();
	}

}

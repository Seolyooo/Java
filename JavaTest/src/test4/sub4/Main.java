package test4.sub4;
class Book{
	private String title ;
	private String auther;
	private String isbn;
	private boolean isBorrowed;
	
	public Book(String title,String auther,String isbn) {
		
		this.title= title;
		this.auther=auther;
		this.isbn= isbn;
		this.isBorrowed=false;
	}
	
	public void borrowBook() {
		this.isBorrowed=true;
		
		if() {
			System.out.println(this.title+ "이미대출");		

		}else {
			System.out.println("대출한도서:"  + this.title);		
		}
	}
	public void returnBook() {
		System.out.println("도서반나뱌ㅑㅑㅑㅑㅑㅑㅑ:"  + this.title);		

	}
	public void getBookInfo() {
		System.out.println("책제목 : "+ this.title);
		System.out.println("책저자 : "+ this.auther);
		System.out.println("isbn : "+ this.isbn);
		System.out.println("대출여부 : "+ (this.isBorrowed?"가능":"불가"));
	}
	public String getTitle() {
		return title;
	}
	
	
}
class Member{
	private String name;
	private String memberId;
	private Book borrowBook;
	
	public Member(String name,String memberId) {
		this.name = name;
		this.memberId= memberId;
		this.borrowBook=null;
		
	}
	public void borrowBook(Book book) {
		borrowBook = book;
		
		System.out.println("도서대출 : "+ book.getTitle());
	}
		
	public void returnBook(Book book) {
	borrowBook = null;
	borrowBook.returnBook();
	}
	
	public void getMemberInfo() {
		System.out.println("이름"+this.name);
		System.out.println("회원"+this.memberId);
		
		if(	borrowBook!= null) {
		System.out.println("대출한도서:"  + borrowBook.getTitle());	
		}
		else {
			System.out.println("대출한도서: 없음");	

		}
	}
	
	
	
}



public class Main {

	public static void main(String[] args) {
		Book b = new Book("자바","제임스","101-1234-1001");
		
		Member m = new Member("홍길동","a001");
		
		b.getBookInfo();
		System.out.println("==============");
		m.borrowBook();
		System.out.println("==============");
		b.getBookInfo();
		System.out.println("==============");
		m.getMemberInfo();
		System.out.println("==============");
		m.borrowBook();
		System.out.println("==============");
		m.returnBook();
		System.out.println("==============");
		m.getMemberInfo();
		System.out.println("==============");
		
	}

}

package test3;
/*
* 날짜 : 2025/07/16
* 이름 : 설유진
* 내용 : 정적변수 연습문제
*/

class Student{
	public static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	
	public Student(String studentName, String major, int grade) {
		
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}	
	
	public void studentInfo() {
		System.out.println("---------------");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		}
}


public class Test04 {
	public static void main(String[] args) {
	
		Student.studentId = 20201000;
		Student kim = new Student("김유신", "국문과", 1);
		
		Student lee = new Student("이순신","경제학과",1);
		Student lim = new Student("임걱정","경영학과",1);
		
		kim.studentInfo();
		lee.studentInfo();
		lim.studentInfo();
	}
}

package test4.sub1;
class Student {
	
	
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public Student(String studentName,String studentId,String subject,double score) {
		this.studentName=studentName;
		this.studentId=studentId;
		this.subject= subject;
		this.score= score;
		
	}
	
	
	public void updateSocre(double score) {
		
		

		if(score<=100) {
			this.score= score;
			System.out.println("점수 수정 완료");
		}else {
			System.out.println("잘못된 점수 입력");

		}
		
	}
	public double getScore() {
		return score;
	}	
	
	public void printStudentInfo() {
		System.out.println("학생이름 : " + studentName);
		System.out.println("학생 id: "+studentId);
		System.out.println("과목 : "+subject);
		System.out.println(" 점수 : "+score);

		
	}
	
}



public class studentSocre {

	public static void main(String[] args) {
		Student st=new Student ("홍길동","S001","자바",90.0);
		
		
		st.printStudentInfo();
		System.out.println("---------------------");
		
		st.updateSocre(98.0);
		System.out.println("---------------------");
	
		
		st.updateSocre(102.0);
		System.out.println("---------------------");

		st.printStudentInfo();
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		
	}

}

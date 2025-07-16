package sub7;
/*
 * 2025/07/16
 * 설유진
 * 추상 클래스 실습하기
 * 
 */


public class AbstractTest {

	public static void main(String[] args) {
		//추상 클래스는 갹체 생성 불가
		//Animal animal = new animal();
		
		Animal t = new Tiger();
		Animal e = new Eagle();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		
		
		
		
		
		
		
		
	}

}

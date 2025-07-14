package sub1;

/*
* 2025/07/14
* 설유진
* 자바 객체지향 프로그래밍 클래스 실습하기
* 
* 
* 
* 스택
* - 자바의 일반 변수, 참조변수, 매개변수가 push 되어 저장되는 매모리 영역
* - 해당 메서드 영역 및 프로그램이 종료 되면 pop 되어 메모리에서 제거
* - 객체(참조변수)는 스택에서 heap 메모리 공간의 객체 인스턴스 참조 (주소값 저장)
* 
* 힙
* - 자바의 객체가 생성되는 메모리 공간
* - 스택처럼 순서대로 샇이지 않고 랜덤으로 메모리 공단에 생성
* - 참조변수가 제거되서 더 이상 참조 되지 않으며 garbage colloecter 로 해제됨
*/
public class ClassTest {

	public static void main(String[] args) {
	//객체 생성 (인스턴스화)
	Car sonata = new Car();
	
	//객채 초기화
	sonata.name = "소나타";
	sonata.color = "흰색";
	sonata.speed = 0;
	
	//객체 상호작용(기능활용)
	sonata.speedUp(80);
	sonata.speedDown(10);
	sonata.show();
	
	//객체 생성, 초기화,ㅡ 상호작용
	Car avante = null;		//선언할때는 일반적으로 널로 초기화
	
	avante = new Car(); 	//생성
	
	avante.name = "아반테";
	avante.color = "검정색";	//초기화  : 변수에 최초로 값을 대입
	avante.speed = 0;
	
	avante.speedUp(60);
	avante.speedDown(20);
	avante.show();
	/*
	 * 은행계좌 객체 생성
	 * 은행명: 국민은행
	 *  계좌 번호:101111001 
	 *  입금주 : 설유진
	 *  현재잔액 : 0
	 * 
	 * 
	 */
	 
	Account kb = new Account();
	
	kb.bank="국민";
	kb.id = "101111001";
	kb.name= "tjfdbwls";
	kb.balance = 0;
	
	kb.deposit(100000);
	kb.withdraw(30000);
	kb.show();
	
	
	Account ar = new Account();
	
	ar.bank="우리은행";
	ar.id="101212001";
	ar.name= "가ㅣㅁ춘주";
	ar.balance=10000;
	
	ar.deposit(15000);
	ar.show();
	}
}
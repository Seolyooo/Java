package sub2;
/*
* 2025/07/14
* 설유진
* 캡술화 실습하기
* 
* 캡술화(정보은닉)
* - 캡술화는 객체의 속성을 외부에서 참조하지 못하게 객에릐 속성을 은닉하는 특성
* - 클래스의 속성을 반드시 private으로 선언
* - private 선언을 하면 생성자로 속성을 초기화
* - 은닉된 정보를 안전하게 사용하기 위해 Getter Setter 사용
* 
* 
* 
* 

*/
public class EncapsuleTest {

	public static void main(String[] args) {
		
		//객체 생성
		Car sonata  = new Car("소나타", "흰색",0); 	//생성자 호툴
		
		//초기화 - 은닉된 속성은 생성자로 초기화
		//sonata.name - "소나타";
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반테","검정색",0);
		
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		// 개별 속성이 은닉되어 있기때문에 속성 수정 불가. Setter로 수정
		//avante.color= "남색";
		
		avante.setColor("남색");
		avante.show();
		
		//Account 객체 생성과 초기화
		
		Account ac = new Account("국민은행","101111001","김유신",10000);
		
		ac.deposit(20000);
		
		ac.setName("김유진");
		ac.show();
		
		Account wb = new Account("우리은행","101111001","김춘추",30000);

		
		wb.deposit(20000);
		wb.setBank("너희은행");
		wb.show();
		
		
		
		
		
		
		
		
	}

}

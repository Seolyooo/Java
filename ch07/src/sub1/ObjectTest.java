package sub1;
/*
 * 2025/05/21
 * 설유진
 * 자바 object 클래스 실습하기
 * 
 */


public class ObjectTest {

	public static void main(String[] args) {
		//자바의 모든 클래스는 object를 상속하기 때문에  object 타입으로 업캐스팅 가능
		Object a1 = new Apple("한국",3000);
		Object a2 = new Apple("일본",3000);
			
		//toString() - 객체 정보 조회
		System.out.println(a1.toString());
		System.out.println(a1); // toString()은 defalut 메서드이기 때문에 객체이름으로 출력가능
 		
		//객체 비교
		if(a1== a2) {
			System.out.println(" 주소값 같다");
		}else {
			System.out.println(" 주소값 다르다");
		}
		if(a1.equals(a2)) {
			System.out.println("객체가 같다");
		}else {
			System.out.println("객체가 다르다");
		}
		
		//객체 해시값(객체 실변번호) 확인
		System.out.println("a1 해시값 :"+a1.hashCode());
		System.out.println("a2 해시값 :"+a2.hashCode());
	}

}

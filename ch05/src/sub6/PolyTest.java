package sub6;

/*
 * 2025/07/15
 * 설유진
 * 다형성 실습하기
 * 
 * 
 * 다형성 
 * - 상속관계에서 부모 클래스의 기능이 자식 클래스에서 다양한 형태로 변하는 특징
 * - 객체 생성 할때 타입 선언을 부모 클래스 타입으로 선언 (업캐스팅)
 * - 다형성을 통해서 프로그래밍의 중복 코드 줄이고 유연성 향상
 */



public class PolyTest {

	
	
	public static void main(String[] args) {
		
		//다형성 - 자식 객체의 타입 선언을 부모 타입으로 선언
		Animal ti = new Tiger();	//업캐스팅
		Animal ea = new Eagle();	//업캐스팅
		Animal sh = new Shark();		//업캐스팅
		
		ti.move();
		ti.hunt();
		
		ea.move();
		ea.hunt();

		sh.move();
		sh.hunt();

		
		System.out.println("--------------");

		//다운캐스팅 -  부모 타입의 객체를 자식 타입으로 캐스팅(형변환)
		Tiger t = (Tiger) ti;
		Eagle e = (Eagle) ea;
		Shark s = (Shark) sh;
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		System.out.println("--------------");
		//다형성을 활용한 객체 배열
		Animal[] arr = {t,e,s};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		
		printsound(dog);
		printsound(cat);
		
		
		
	}
	
	public static void printsound(Pet pet) {
		pet.makesound();
	}
		
	
}

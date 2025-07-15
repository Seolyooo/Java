package sub5;

public class Sedan extends Car{

	private int cc;		// 배기량

	//상수 - 최초 한번 초기화된 값을 고정된 변수
	private final int max_speed  =180;
	public Sedan(String name, String color, int speed, int cc) {
		//부모클래스 생성자 호출, 자식클래스는 부모클래스 속성을 초기화해줘야 됨
		super(name, color, speed);
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		//부모클래스 speedup을 자식클래스에 맞게 재정의
		this.speed += speed;
		
		if(this.speed >max_speed) {
			this.speed = max_speed;
		}
		
	}
	public void turbo() {
		//부모 클래스 speed 참조를 위해 접근 권한을 private에서 protected로 변경
		this.speed += 10;
	}
	public void show() {
		super.show(); //부모클래스 show() 호출
		System.out.println("배기량:" + this.cc);
	}
}

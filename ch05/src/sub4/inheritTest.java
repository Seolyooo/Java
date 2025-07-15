package sub4;
/*
 * 2025/07/15
 * 설유진
 * 상속 실습하기
 * 
 * 
 * 
 */
public class inheritTest {

	public static void main(String[] args) {
		
		//car 상속실습
		Sedan sonata = new Sedan ("소나타", "흰색",0,2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색",0,2000);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
	

	StockAccout kb = new StockAccout("kb","101220100","홍길동",10000,"삼성",10,100000);
	
	kb.deposit(100000);
	kb.withdraw(50000);
	kb.buy(5,8000);
	kb.show();
	
	kb.sell(5,9000);
	kb.show();
	
	Doctor dc = new Doctor("김유신",23,"소아과");
	
	Engineer en = new Engineer("김춘추",25,"소프트웨어");
	dc.work();
	en.work();
	
	}
}

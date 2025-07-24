package sub3;
/*
 * 2025/07/24
 * 설유진
 * 자바 스레드 동기화 실습하기
 * 
 */



public class ThreadsynkTest {

	public static void main(String[] args)  throws InterruptedException{

		Count count = new Count();
		
		CountThread c1 = new CountThread(count);
		CountThread c2 = new CountThread(count);
		CountThread c3 = new CountThread(count);
		
		c1.start();
		c2.start();
		c3.start();
		
		
		c1.join();
		c2.join();
		c3.join();

		System.out.println("최종결과 : "+ count.getNum());
	}

}

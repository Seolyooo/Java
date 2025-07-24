package sub2;
/*
 * 2025/07/24
 * 설유진
 * 자바 스레드 상태 실습하기
 * 
 */
class Sub1Thread extends Thread{
	public void run() {
		for(int i = 0 ; i <1000 ;i++) {
			System.out.println("sub1thread - "+ i);
		}
		Thread.yield();
		
	}
	
	
}

class Sub2Thread extends Thread{
	public void run() {
		for(int i = 0 ; i <1000 ;i++) {
			System.out.println("sub2thread - "+ i);
		}
	};
	
}

public class ThreadYieldTest {

	public static void main(String[] args) {

		
		Sub1Thread s1 = new Sub1Thread();
		Sub2Thread s2 = new Sub2Thread();
		
		s1.start();
		s2.start();
		
		try {
			s1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

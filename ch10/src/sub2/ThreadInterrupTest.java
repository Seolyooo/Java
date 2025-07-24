package sub2;
/*
 * 2025/07/24
 * 설유진
 * 자바 스레드 상태 실습하기
 * 
 */
class Subthread extends Thread{
	public void run() {
		int i =1;
		
		try {
			while (true) {
				System.out.println("subt - " +i);
				i++;
				
				Thread.sleep(1000); // 1초정지
				
			}
		}catch (InterruptedException e) {
				e.printStackTrace();
		}
	}

}

public class ThreadInterrupTest {

	public static void main(String[] args) {

		Subthread sub = new Subthread();
		
		sub.start();
		
		try {
			//메인스레드 5초 일시 정지
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//작업 스레드 일시정지 발생시키기
		sub.interrupt();
		
		System.out.println("프로그램 종료");
		
	}

}

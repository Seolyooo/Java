package step1;
import java.util.Scanner;

/*
	문제
	 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오
	 서기 연도 = 불기 연도 - 543
	
	입력
	서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
	
	출력
	불기 연도를 서기 연도로 변환한 결과를 출력한다.

 
 */


public class Main08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a =  sc.nextInt();
		
		System.out.println(a-543);

	}

}

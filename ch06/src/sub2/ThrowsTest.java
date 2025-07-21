package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 2025/07/21
 * 설유진
 * 자바 예외 던지기 실습하기
 * 
 */

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method1(7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void method1 (int n)throws Exception{ //모든 예외 처리 클래스를 상솟하는 상위 클래스 Exception 처리
		
		method2(n);
		
		}
	// InputMismatchException,ArithmeticException 을 method2를 호출한 곳에서 예외처리
	public static void method2(int n) throws InputMismatchException,ArithmeticException{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값입력: ");
		
		int value = scanner.nextInt(); //inputMismatchExeption
		
		int result = n/value; //ArtithmeticException
		
		System.out.println("result : " + result);
	}
	
		
}

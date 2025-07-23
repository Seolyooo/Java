package test5;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		int answer = (int) (Math.random()* 10)+1;
		int input = 1, count=0;
		
		do {
			count++;
			System.out.println("----------");
			System.out.println("1~10사이의 값 입력");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(input <0) {
					throw new Exception("음수는 입력 할 수 없다");
				}
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
			if(answer>input) {
				System.out.println("더 큰 수 입력");
				
			}else if (answer > input){
				System.out.println("작은 수 입력");
			}else {
				System.out.println(answer+"정답");
				System.out.println("횟수"+ count);
			}
			
		}while(true);
		System.out.println("프로그램 종료");
		
	}
}

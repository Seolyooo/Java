package step2;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();	
		
		int timer = sc.nextInt();
		
		int time = m + timer;
		
		if(time >= 60) {
			if(h+ (time/60) >= 24) {
				System.out.println((h+(time/60))-24 + " "+(time-(60*(time/60))));
			}
			else {
				System.out.println((h+(time/60)) +" "+(time-(60*(time/60))));
			}
		}else {
			System.out.println(h + " " +time);
		}
		
	}

}

package test5;

import java.util.Iterator;

public class Test04 {

	public static void main(String[] args) {
		String fileName = "helloworld.java";
		
		int idx= fileName.indexOf(".");
		String title = fileName.substring(0, idx);
		String exit = fileName.substring(idx+1);
		
		System.out.println("파일명" + title);
		System.out.println("확장자" + exit);
		
		String strScore ="60,72,82,86,92";
		String[] scores = strScore.split(",");
		
		int total = 0;
		
		for (String score : scores) {
			total += Integer.parseInt(score);
			
		}
		
		System.out.println("strScore 총점 :"+ total);
	}

}

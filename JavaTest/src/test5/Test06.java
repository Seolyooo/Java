package test5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		printList(createList());
	}
	public static void printList(ArrayList<Integer> scoreList) {
		int total = 0;
		int size = scoreList.size();
		
		for (int i = 0; i < size; i++) {
			int score = scoreList.get(i);
			total+= score;
			System.out.println(score);
			
			if(i ==size-1) {
				System.out.println("=");
			}else {
				System.out.println("+");
			}
			
		}
		System.out.println(total);
	}

	public static ArrayList<Integer> createList(){
		ArrayList<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for (int i = 0; i <=10; i++) {
			int num = rand.nextInt(41)+ 60;
			scoreList.add(num);
		}
		return scoreList;
		
		
	}
	
	
	
	
	
	
	
}


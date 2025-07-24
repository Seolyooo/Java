package test6;

public class Test02 {

	public static void main(String[] args) {
		int count= 0;
		for (int i = 0 ; i < 7 ; i++) {
			
			
			if (i <=3)
				count++;
			else count--;
			
			for( int j = 1; j < 5-count; j++)
				System.out.println("☆");
			for( int j = 1; j < 5-count; j++)
				System.out.println("★");
			for( int j = 1; j < 5-count; j++)
				System.out.println("☆");
			System.out.println();
		}
		System.out.println();
	}

}

package p187;


import java.util.Scanner;

class Rectangle{
	
	int width;
	int height;
	public int getArea () {
		return width* height;
	}
}



public class Rectapp {
	public static void main(String[] args) {
		
		Rectangle re = new Rectangle();
		
		Scanner s = new Scanner(System .in);
		System.out.println(">>");
		re.width=s.nextInt();
		re.height= s.nextInt();
		System.out.println("사각형의 면적은 : " + re.getArea());
		s.close();
		
		
	}

}

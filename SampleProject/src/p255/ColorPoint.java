package p255;
class Point{
	private int x,y;
	public void set(int x,int y) {
		
		this.x= x;
		this.y=y;
	}
	public void show() {
		System.out.println("("+x+",)"+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
}

public class ColorPointEx{
	
	Point p =new Point();
	p.set(1,2);
	p.show();
	ColorPoint cp =new showColorPoint();
	}
	}


public class ColorPoint {

	public static void main(String[] args) {

		
		
		
	}

}

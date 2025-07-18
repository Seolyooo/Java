package p273;


class Point{
	private int x,y;
	public void Point(int x,int y) {
		
		this.x= x;
		this.y=y;
	}
	public void show() {
		System.out.println("("+x+",)"+y+")");
	}
}

class ColorPoint extends Point{
	
	private String color;

	public ColorPoint(int x, int y ,String color){
	super(x,y);
	this.color = color;
	}
	public void showcolor(){
		System.out.println(color);
		show();
	}
	
}


public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint (5,6,"blue");
		cp.
	}

}

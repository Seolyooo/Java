package p191;








public class Circle {
	int radius;
	String name;
	public Circle() {
		radius =1 ; name = "";
	}
	public Circle(int r, String n) {
		radius = r; name= n;
		
		
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle pizza = new Circle(10,"자바피자");
		
		double area = pizza.getArea();
		System.out.println("d");
		
		Circle dount =   new Circle();
		 dount.name = "도너슈피자";
		 
		 System.out.println(dount.name + "s");
		
	}

}

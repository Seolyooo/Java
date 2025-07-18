package p187;

public class Circle {
	int radius;
	String name;


	public Circle() {}

	public double gerArea() {
	return 3.14* radius * radius;
	}



public static void main(String [] args) {

	Circle pizza;
	pizza = new Circle();
	pizza .radius= 10;
	pizza.name = "자바피자";
	double area = pizza.gerArea();
	System.out.println(pizza.name +"면적은  :" + area);
	
	Circle dount = new Circle();
	dount .radius=2;
	dount.name ="자바 도넛";
	area = dount.gerArea();
	System.out.println(dount.name +"면적은  :" + area);



}

}

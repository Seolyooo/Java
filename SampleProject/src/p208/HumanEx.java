package p208;
class Human{
	private String name;
	private int age;
	private  double height;
	private  double weight;
	
	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
			
	}
	public Human(int i) {
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println(name+ age + height+ weight);
	}
	
}


public class HumanEx {

	public static void main(String[] args) {
		Human h = new Human("홍길동",21,180.2,34.3);
		h.show();
		
		Human[] hh;
		hh= new Human[5];
		
		for(int i =0 ; i<hh.length; i++) {
			hh[i]= new Human(i);
		
		}
		
	}

}

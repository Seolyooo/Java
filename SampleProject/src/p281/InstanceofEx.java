package p281;

class Person();
class Student extends Person{
	
	
}
class Researcher extends Student{
	
}
class Professor extends Researcher{
	
}


public class InstanceofEx {
	
	 static void print(Person p) {
		if (p instanceof Person)	
			System.out.print("Person");
		if (p instanceof Student)	
			System.out.print("Student");
		if (p instanceof Researcher)	
			System.out.print("Researcher");
		if (p instanceof Professor)	
			System.out.print("Professor");
	 }
	public static void main(String[] args) {
		System.out.print("");
		
	}

}

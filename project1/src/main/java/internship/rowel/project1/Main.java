package internship.rowel.project1;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		Holder student1 =new Holder();
		student1.name = "Aryan";
		student1.mobile = 1234567890L;
		student1.cgpa = 9.3;
		student1.skill = "Java";
		Holder student2 =new Holder();
		student2.name = "Ben";
		student2.mobile = 1234567891L;
		student2.cgpa = 9.1;
		student2.skill = "Python";
		//System.out.println(student1.name+" "+student1.mobile+" "+student1.cgpa+" "+student1.skill);
		
		student1.confirm();
		
	}
}
//Datatypes :int float char byte double boolean long short
//Wrapper classes : Integer Float Short Character Double Boolean Long Byte
//String
class Holder {
	
	String name,skill;
	Long mobile;Double cgpa;
	public void confirm() {
		System.out.println(this.name+" "+this.skill+" "+this.mobile+" "+this.cgpa);
	}
	public void confirm2() {
		System.out.println(this.name+" "+this.skill+" "+this.mobile+" "+this.cgpa);
	}
}

class Bike {
	
	String model;Integer year,milage;Double cost;
}
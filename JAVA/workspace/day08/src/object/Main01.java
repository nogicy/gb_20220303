package object;

class Student {
	int age;
	
	public String getName() {
		String name = " 자바학생 ";
		return name;
	}
	
	public void sayName() {
		String myname = this.getName(); // 메서드명은 동일할수없어 this는 지워도상관없다.
		System.out.println( myname );
	}
}


public class Main01 {

	public static void main(String[] args) {	
		Student std = new Student();
		std.sayName();
	}

}

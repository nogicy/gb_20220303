package hiding;

class Student{
	public String name = " 자바 학생 ";
	private int weight = 100;
}


public class Main01 {

	public static void main(String[] args) {
		Student std = new Student();
		System.out.println(std.name); // public 이므로 접근가능
//		System.out.println(std.weight); // private 이므로 접근불가
		

	}

}

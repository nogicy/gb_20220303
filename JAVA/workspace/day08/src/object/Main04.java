package object;

class StudentJava{
	String name;
	int age;
	
	public StudentJava( String name, int age) {
		// 생성자 파라미터의 값을 멤버변수에 복사
		this.name = name;
		this.age = age;
	}
}





public class Main04 {

	public static void main(String[] args) {
		// 생성자에 파라미터가 정의된 경우
		// 객체 생성 구문에서 해당 파라미터를 전달해야 한다.
		StudentJava stdjava = new StudentJava(" 자바학생 ", 27);

	}

}

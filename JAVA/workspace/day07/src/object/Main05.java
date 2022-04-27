package object;

class User{	
	String subject; // 전역변수 // this = 같은 명칭의 변수가있다면 지역변수와 전역변수중 지역변수가 우선적으로 사용되며 전역을 사용하기위해서는 this를 기입하여 사용하면된다.
	int age;
	String hobby;
	
	public void setName( String name, String hobby ) { // this없이 변수 hobby가아닌 파라미터2가 바로 출력이되어 독서가 출력된것, 
		// 전역변수를 출력하려한다면 this를 넣어야한다. 
		System.out.println(name);
		this.subject  = "국비지원";
		this.age = 25;
		this.hobby = hobby;
		System.out.println("과목 : " + this.subject + ", 나이 : " + this.age + ", 취미 : " + this.hobby );
	}
	
}

public class Main05 {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("자바학생", "독서");
	
	}
	

}

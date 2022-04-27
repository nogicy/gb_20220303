package hiding;

public class Main01 {

	public static void main(String[] args) {
		// 객체생성
				StudentJava2 st2 = new StudentJava2();
				
				// setter 임의의 데이터 세팅, name, age 모두
				st2.setUserName("자바각성");
				st2.setUserAge(999999);
				
				// getter 출력, name, age 모두
				st2.all();

	}

}

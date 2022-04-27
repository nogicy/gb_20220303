package object;


class StudntUser{
	String name;
	
	public void setName( String name ) { //2.여기들어감
		this.name = name; //3.지역변수에 들어온걸 this를 활용 전역변수로 재선언
	}
	
	public String getName ( ) {
		return this.name; // 4. 재선언된 전역변수를 외부로 리턴시킴.
	}
}
public class Main06 {

	public static void main(String[] args) {
		// StudentUser 클래스를 사용해서 객체를 생성 후
		// 객체의 메서드 만을 사용해서
		// 전역변수 name에 "자바학생"을 할당하고 출력하여라.
		// 4시 30분
		StudntUser sud = new StudntUser();
		sud.setName("자바학생"); // 1. 입력받음
		System.out.println( sud.getName()); // 5. 리턴된 값을 출력함.
		
		
		sud.name = " 뭘봐 ";
		System.out.println(sud.name);
	
		
		sud.setName("1번");
		System.out.println(sud.getName());
	}
		
		
		

	}


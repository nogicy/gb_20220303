package object;
// 11시 15분까지

class Menber{
	String name;
	int age;
	
	// getName(), return, 전역변수 name
	// 전역변수를 외부로 리턴시키는 메서드
	String getName( ) {
		return this.name;
	}
	
	// setName(), param name, 전역변수 name = param name 
	// 파라미터를 통해 내용을 받고 받은걸 전역변수로 전환시켜 전체적 사용가능하게하는 메서드
	void setName( String name ) {
		this.name = name;
			
	}
	
	// getAge(), return, 전역변수 age
	int getAge( ) {
		return this.age;
	
	}
	// setAge(), param age, 전역변수 age = param age
	void setAge( int age ) {
		this.age = age;
	
	}
	//say(), getName(), getAge() 각각 출력
	
	void say() { 
		System.out.println(getName());
		System.out.println(getAge());
	}
	String say02() { // 리턴방법을쓰면 메서드 + 메서드로 외부에서 출력문에 넣을수있다. + 
		return "이름 출력결과값 : " + getName() +"\n" + "숫자 출력결과값 : " + getAge();
	}
		
}


public class Main02 {

	public static void main(String[] args) {
		// Member class 객체생성
		Menber mbr = new Menber();
		
		
		// 메서드를 사용해서 전역변수 name, age에 임의의 데이터 할당
		// 데이터를 받기위한 set메서드
		mbr.setName("KYM"); 
		mbr.setAge( 20+7 );
		
		// 객체.say() 메서드호출 :
		// 데이터를 출력하기위한 get메서드
		mbr.say();  //밑의 코드랑 차이는 크게없음
		
		// 출력 결과값 : 임의의 데이터 할당한 데이터 값 출력
		System.out.println("이름 출력결과값 : " + mbr.getName() + "\n숫자 출력결과값 : " + mbr.getAge());
		System.out.println("-------------------------------------");
		System.out.println(mbr.say02());
	}


}

package hiding;

// 11시 25분까지
public class Merber {
	private String name;
	private String age;
	
	/*
	 * parma name, age 생성자.
	 * 전역변수.name = new , 전역변수.age = age
	 */
	
	Merber(String name, String age) {
		this.name = name;
		this.age = age;
		System.out.println("-----------------------게시판 시작------------------------");
	}
	
	void print( ) {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("-----------------------게시판 시작------------------------");
	}

	/*
	 * name,age 전역변수 getter, setter 생성
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	/*
	 * 생성자와 setter을 같이쓰는경우는 생성자로받고 
	 * 변환된 전역변수를 재할당할때 사용할수있다. 
	 */
	
	
	
	}



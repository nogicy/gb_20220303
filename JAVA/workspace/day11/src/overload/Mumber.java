package overload;

// 문제 1시 40분까지
public class Mumber {
	private String job;
	private int age;
	
	// 기본 생성자
	public Mumber() {
//		System.out.println(" [ 클래스명 : Munber [기본생성자입니다.!] ");
	}
		
	// age를 param값으로, 생성자
	public Mumber(int age) {
		this.age = age;
		
	}
	
	// job를 param값으로, 생성자
	public Mumber(String job) {
		this.job = job;
	}
	
	// job, age를 apram값으로, 생성자
	public Mumber(String job, int age) {
		super();
		this.job = job;
		this.age = age;
	}
	
	// 클래스명, job, age를 출력해주는 toString()
	@Override // 오버라이드 되었는가 확인하는용도
	public String toString() { // 기본?양각?
		return "클래스명 : Mumber [ job = " + job + ", age=" + age + "]" ;
			
	}
	
	public String toStringage() { //age 생성자
		return "클래스명 : Mumber [ age = " + age + "]" ;
			
	}	
	
	public String toStringjob() { // job 생성자
		return "클래스명 : Mumber [ job = " + job + " ]" ;
			
	}
	
}
	
	// maun() 클래스 생성, 객체생성을 생성자 타입별로 생성 후, 출력
	

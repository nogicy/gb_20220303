package test1;

/*
 * 1. Calc 클래스를 생성 한다.(10점)

(데이터베이스 요구사항에 따라 하드웨어와 운영체제에 적합한 DBMS를 선정하고 설치계획을 수립할 수 있다.)

2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.(10점)

(DBMS 설치계획에 따라 DBMS를 설치하고 저장소 연결ㆍ환경설정ㆍ클라언트 접속 작업을 수행 할 수 있다.)

3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.(5점)

(설치된 DBMS를 검증 절차에 따라 데이터베이스 요구사항을 확인 하고 DBMS 설치 완료보고서를 작성할 수 있다.)

4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.(5점)

(테이블ㆍ인덱스ㆍ제약조건을 이해하고 데이터베이스 설계에 따라 설치된 DBMS에 적합한 오브젝트 생성 계획을 수립할 수 있다.)
5.int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.(5점)

(설계에 따른 테이블과 인덱스 등의 오브젝트에 기반 하여 데이터 파일ㆍ컨트롤파일ㆍ로그파일에 필요한 용량을 산정하고 형식을 정의할 수 있다.)

6.int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다. (5점)

관리자 도구 혹은 명령어를 이용하여 데이터베이스 블록사이즈ㆍ로그관리ㆍ환경설정을 적용하고 확인 할 수 있다.)

7.main 메서드를 포함하는 클래스를 생성 한다.(10점)

데이터베이스에 대한 관리자ㆍ사용자 계정을 이해하고 데이터베이스 사용규칙에 따라 계정별 권한 설정을 적용할 수 있다.)

8. 2개의 정수를 입력 받는다.(10점)

데이터베이스에 대한 관리자ㆍ사용자 계정을 이해하고 데이터베이스 사용규칙에 따라 계정별 권한 설정을 적용할 수 있다.)

9.입력 받은 정수를 각각 출력 한다.(10점)

(생성된 데이터베이스의 용량ㆍ권한ㆍ환경설정을 점검하고 데이터베이스 명세적 검증을 통하여 데이터베이스 완료보고서를 작성할 수 있다.)

10.main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.(5점)

(생성된 데이터베이스의 용량ㆍ권한ㆍ환경설정을 점검하고 데이터베이스 명세적 검증을 통하여 데이터베이스 완료보고서를 작성할 수 있다.)

11.main 메서드에서 본인의 이름을 출력한다.(5점)

(생성된 데이터베이스 오브젝트의 적정성과 무결성을 판단하고 데이터베이스 오브젝트 명세를 포함한 완료보고서를 작성할 수 있다.)

12.Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)

(생성된 데이터베이스 오브젝트의 적정성과 무결성을 판단하고 데이터베이스 오브젝트 명세를 포함한 완료보고서를 작성할 수 있다.)

13.Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)

(생성된 데이터베이스 오브젝트의 적정성과 무결성을 판단하고 데이터베이스 오브젝트 명세를 포함한 완료보고서를 작성할 수 있다.)
 */

public class Calc {
	private String name;

	public Calc(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int plus(int x, int y) {
		int num = x + y;
		System.out.println("하하하"+ num);
		return num;
	}
	
	public int minus(int x, int y) {
		int num = x - y;
		System.out.println(num);
		return num;
	}
	
	public int times(int x, int y) {
		int num = x + y;
		System.out.println(num);
		return num;
	}
	
	public int division(int x, int y) {
		int num = x / y;
		System.out.println(num);
		return num;
	}
	
}

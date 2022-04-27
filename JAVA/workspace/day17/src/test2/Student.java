/*1. Student 클래스를 생성 한다.(10점)

(소프트웨어 공학기술의 요구사항 도출 기법을 활용하여 업무 분석가가 제시한 분석모델에 대해서 확인할 수 있다.)

2. Student 클래스에 private 접근제어의 String 타입의 name, int 타입의 ban, no, kor, eng, math변수 선언(10점)

(업무 분석가가 제시한 분석모델이 개발할 응용소프트웨어에 미칠 영향을 검토하여 기술적인 타당성 조사를 할 수 있다.)

3. 파라미터가 있는 생성자, getter, setter를 생성한다.(10)

(업무 분석가가 분석한 요구사항에 대해 정의된 검증 기준과 절차에 따라서 요구사항을 확인할 수 있다.)
4. kor, eng, math의 총합을 return하는 메서드 생성.(10)

(윈도우함수와 그룹함수를 사용하여 순위와 소계ㆍ중계ㆍ총합계를 산출하는 DML(Data Manipulation Language)명령문을 작성할 수 있다.)

5. kor, eng, math의 평균값을 return하는 메서드를 생성(10)

(응용시스템에서 사용하는 특정 기능을 수행하기 위한 SQL문을 작성할 수 있다.)

6. name, ban, no, kor, eng, math 를 출력하는 메서드 생성(10)

(사용자의 그룹을 정의하고 사용자를 생성 또는 변경할 수 있고 사용자의 권한 부여와 회수를 위한 DCL(Data Control Language)명령문을 작성할 수 있다.)

7. main 메서드를 포함하는 클래를 생성(10)

(반복적으로 사용하는 특정 기능을 수행하기 위해 여러 개의 SQL명령문을 포함하는 프로시저를 작성하고 프로시저 호출문을 작성할 수 있다.)

8. Student 클래스 객체 생성(10)

(일련의 연산처리 결과가 단일 값으로 반환되는 사용자 정의함수를 작성하고 사용자 정의함수를 호출하는 쿼리를 작성할 수 있다.)

9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출(10)

(일련의 연산처리 결과가 단일 값으로 반환되는 사용자 정의함수를 작성하고 사용자 정의함수를 호출하는 쿼리를 작성할 수 있다.)

10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출(10)

(하나의 이벤트가 발생하면 관련성이 있는 몇 개의 테이블 간에 연속적으로 데이터 삽입ㆍ삭제ㆍ수정을 할 수 있는 트리거를 작성할 수 있다.)
 */
package test2;

public class Student {
	
	private String name;
	private int ban, no, kor, eng, math;
	
	int total() {
		int total = kor + eng + math;
		System.out.println("총합 : " + total);
		return total;
	}
	
	int Average() {
		int total = kor + eng + math;
		System.out.println("평균 : " + (double)(total/3));
		return total;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ",\n ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

}

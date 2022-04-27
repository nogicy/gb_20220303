package test2;

public class Main {

	public static void main(String[] args) {
		Student st = new Student(" 김영민 ", 60, 70, 80, 90, 100);
		
		st.total(); 	// 총합
		st.Average(); 	// 평균값
		System.out.println(st.toString()); // 모든 자료
	}

}

package loop;

public class Main06 {

	public static void main(String[] args) {
		// 구구단 7단, do~while문으로 출력
		// 2시 30분까지
		
		int save = 0;
		
		int i = 1;
		
//		do {
//			save = 7 * i ;
//			i++;
//			System.out.println(save);
//		} while ( i < 10 );
//		
		do { // ver.2
			save += 7;
			i++;
			System.out.println(save); // 내리면 최종값만 출력됨
		} while ( i < 10 );
		
		
		
		
		
		
		
		
		
		
		
	}

}

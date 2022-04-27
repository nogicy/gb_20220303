package loop;

public class Main02 {

	public static void main(String[] args) {
		// 구구단 7단의 결과 값
		// 11시 30분
		
		System.out.println("-------------------------");
		
		int sven = 0;
		
		for (int i = 1; i <= 9 ; i++) {
			System.out.println("i    : " + i);
			sven += 7;
			System.out.println("sven : " + sven);
			
		}
		// 공유받은 다른 방법 + 좀더 간결하다.
//		System.out.println("-------------------------");
//		int j = 0;
//		
//		for ( int i = 1; i < 10; i++ ) {
//			j = 7 * i;
//			System.out.println(j);
//		}
	}

}

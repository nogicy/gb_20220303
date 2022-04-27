package loop;

import java.util.Iterator;

public class Main10 {

	public static void main(String[] args) {
		// 문제1, 1~50까지 숫자의 합
		int all = 0;
		
		for (int i = 0; i < 50; i++) {
			all += i;
			
		}
		System.out.println(all);
		System.out.println("-------------------------");
	
		
		// 문제2. 구구단 2단
		//2 * 1 = 2
		//2 * 2 = 4
		//2 * 3 = 6
		
		int Tow = 0;
		
		for ( int i = 1; i < 10; i++ ) {
			Tow = 2 * i;
			System.out.println("2 * " + i + " = " + Tow);
				
		}
		System.out.println("--------------------------");
		
		
		
		// while문
		// 문제1. 10번찍어 안 넘어 가는 나무 없다.
		// 나무를 1번 찍었습니다.
		// 나무를 2번 찍었습니다.
		// ...
		// 나무를 10번 찍었습니다.
		// 나무가 넘어갑니다.
		
//		int wold = 0; // 변수선언 이거없어도되네..?
		
		int ivent = 0; // 초기값 // 초기값만 있어도되네?
		
		while ( ivent < 10 ) { // 조건식
//			wold = i; // 변수 반복시킬 ?없어도 돌아가네
			ivent++; // 초기값 이게 1씩 증가로 들어가서 괜찮구나
			System.out.println("나무를 " + ivent + " 번 찍었습니다.");
			
		}
		System.out.println("축하합니다 나무가 넘어졌습니다. ");
		
		
	}

}

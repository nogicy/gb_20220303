package muyaho;

import java.util.Scanner;

/*
 * 윳놀이 게임을 만듦! (if문과 배열 이용)
 * 코드업 1207번 문제
 * 
 * 1. 윷이 각각 1개, 2개, 3개, 4개가 뒤집어진 상태를 '도', '개', '걸', '윷'
 * 2. 하나도 뒤집어 지지 않은 상태를 '모' 라고 한다.
 * 3. 4개의 윷의 상태가 배열로 주어지면 도, 개, 걸, 윷, 모 를 출력하는 프로그램을 작성하시오!
 * 		( 윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태 ) // 본인은 랜덤함수로 구현함.
 */

public class Main01 {

	public static void main(String[] args) {
		System.out.println("윷을 던져!!");
		Twoo_suver os = new Twoo_suver(0);
		os.pirnt();
		
		System.out.println( );
		System.out.println( "선택지게임 " );
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력하기\n"
				+ "2. 출력하기\n"
				+ "3. 삭제하기\n"
				+ "4. 끝내기\n");
		System.out.println(" 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
	}

}

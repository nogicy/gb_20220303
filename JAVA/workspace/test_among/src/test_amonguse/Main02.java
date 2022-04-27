package test_amonguse;

import java.util.Random;

public class Main02 {

	public static void main(String[] args) {
/*
 * 2.

두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.(10)

테이블 조회 시간을 단축하기 사용하는 인덱스의 개념을 이해하고 인덱스를 생성하는 DDL(Data Definition Language)명령문을 작성할 수 있다)

[출력 결과]

1+5=6

2+4=6

3+3=6

4+2=6

5+1=6		
 */
		plus();
	}
	static void plus() { // 6짜리 주사위 메서드
		Random rd = new Random();
		int x = rd.nextInt(5), y = rd.nextInt(5);
		int num = x + y;
			if(num == 6) {
			}else if(num >= 7 || num < 0){
				return;
		}
			System.out.println("숫자는 : "+ num);
			System.out.println( );
			System.out.println("1+5=6\r\n"
					+ "\n2+4=6\r\n"
					+ "\n3+3=6\r\n"
					+ "\n4+2=6\r\n"
					+ "\n5+1=6		");
	}
		
}
			


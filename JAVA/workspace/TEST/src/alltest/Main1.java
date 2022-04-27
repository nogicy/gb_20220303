package alltest;

import java.util.Scanner;

/*
 *  Scanner를 통해 점수를 입력 받고, 점수에 맞는 학점을 출력하시오.
 *  95~100 : A+, 90~94 : A, 85~89 : B+, 80~84 : B, 75~79 : C+ 70~74 : C
 *  60~69 : D, 나머지 : F  
 *  
 *  자동으로 점수를 입력받아서 입력받고 자동으로 분류되는 메서드만들기
 */

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		sonclass by = new sonclass(sc.nextInt());
		by.print();
		sc.close();
	}
}
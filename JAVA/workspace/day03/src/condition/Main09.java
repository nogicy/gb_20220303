package condition;

public class Main09 {

	public static void main(String[] args) {
		////////////////////////////////////////////if문
		/*
		 *  문제1. 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라
		 */
		
		int money = 3000;
		
		if ( money >= 3000 ) {
			System.out.println("택시타고가자 ");
		} else {
			System.out.println("걸어가야지? ");
		}
		System.out.println("--------------------------------");
			
			
		/*
		 * 문제2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라.
		 */
	
		int money2 = 3000;
		boolean card = true;
		
		if( money2 >= 3000 || card == true ) {
			System.out.println("택시타고가자! ");
		} else {
			System.out.println("걸어서가자");	
		}
		System.out.println("--------------------------------");
		
		/*
		 * 문제3. 어떤 특정 정수값 a가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하라.
		 */

		int a = 10;
		if ( a%2 == 0 ) { // 짝수여부
			System.out.println(a + "은 짝수 ");
		} else {
			System.out.println(a + "은 홀수 ");
		}
		System.out.println("--------------------------------");
		
		/*
		 * 문제4. 특정 정수값 a2, b2, c2의 최대값을 구하여라
		 */
		
		int a2 = 50, b2 = 20, c2 = 109;
		int max = 0;
		
		if ( a2 > b2 && a2 > c2) { // 참일경우 최대값은 a2
			max = a2; // 최대값이 출력하면 끝
		} else { // 최대값이 a2 아닌경우
			
			if ( b2 > c2 ) { // 남은 최대값 식 계산
				max = b2; // 참일경우 최대값 출력하면 끝
			} else {
				max = c2; // 모두 아닐경우 남은경우의수가 최대값이며 출력하면 끝
			}
		}
		
		System.out.println("최대값은 : " + max);
		
		System.out.println("--------------------------------");

		/*
		 * 문제5-1. 국어, 영어, 수학 점수의 평균이 95점 이상이면 장학색을 출력하여라.
		 * 	  5-2. 그리고 국어점수가 70점 이상이면"국어합격" 그렇지 않으면 "국어 불합격"을 출력하여라
		 *    5-3. 그리고 수학점수가 90점 이상이면"A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점",
		 *    	   60점 이상이면 "D학점", 나머지 "F학점"
		 */
		int kor = 100, eng = 90, mat = 100;
		double avg = (kor + eng + mat)/3; // 평균을 구할때는 구할것들 / 구할개수
				
//		5-1
		if ( avg >= 95 ) {
			System.out.println("장학생");
		}
			
		//5-2
		if ( kor >= 70 ) {
			System.out.println("국어합격");
		} else {
			System.out.println("국어 불합격");
			}
		
		//5-3
		if( mat >= 90 ) {
			System.out.println("A");
		} else if( mat >= 80 ) {
			System.out.println("B");
		} else if( mat >= 70 ) {
			System.out.println("C");
		} else if( mat >= 60 ) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println("--------------------------------");
		
		////////////////////////////////////////switch-case
		/*
		 * 문제1. 1은 "축구", 2는 "농구", 3은 "야구", 4는 "배구", 그 외는 "배드민턴"을 출력 
		 */
		char bool = '4';
		switch ( bool ) {
		case '1':
			System.out.println("축구");
			break;
		case '2':
			System.out.println("농구");
			break;	
		case '3':
			System.out.println("야구");
			break;
		case '4':
			System.out.println("배구");
			break;	
		default :
			System.out.println("배드민턴.");
			break;
		}
		System.out.println("--------------------------------");	
		
		/*
		 * 문제2. 숫자가 3이면 "안녕"이 세줄, 숫자가 2이면 "안녕"이 두줄, 숫자가 1이면 "안녕"이 한줄,
		 * 그 외는 "잘가"를 출력
		 * 
		 */
//		
		int num1 = 1;
		switch ( num1 ) {
		case 3:
			System.out.println("안녕");
		case 2:
			System.out.println("안녕");
		case 1:
			System.out.println("안녕");
			break;
		default :
			System.out.println("잘가");
			break;
		}
		System.out.println("--------------------------------");

//		
//		
}
}
	



		
		
		
		
		
	


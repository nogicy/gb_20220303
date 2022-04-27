package readom;




public class Factorial {

	public static void main(String[] args) {
		int pay = 1000;
		money(100000, 23000);
		won(100000,pay);
		
		/*
		 * 거스름돈
		 * 문제 : 지불한 금액을 나타내는 파라미터1, 물건의 가격을 나타내는 파라미터2
		 * 		이렇게 두 개의 파라미터를 받아 가작 적은 수의 지폐를 거슬러 주는 메소드를 만들어 주세요.
		 * 		(단위는 50000, 10000, 5000, 1000 원입니다.)
		 * 
		 * 예) change(100000, 23000);
		 * 	출력결과 -> 50000원 지폐 : 1장
		 * 		 	 10000원 지폐 : 2장 
		 * 			  5000원	지폐 : 1장
		 * 			  1000원 지폐 : 2장
		 */	
	}
			public static void money(int x, int n) { // 작업할게많아짐, 단순한방법
				 System.out.println("지불금액: " + x + " 물건금액: " + n + "원 ");
				 int result = x - n; // 마이너스 변수 result 생성
		           
				 // 변수 선언
				    int ohmanwon = 0;
				    int manwon = 0;
				    int ohchanwon = 0;
				    int chanwon = 0;
				    
				 // 변수 재선언 및 계산 아래로 내려가면서 result 변수값 순차적계산
				    ohmanwon 	= result / 50000;
				    manwon 		= result % 50000 / 10000;
				    ohchanwon 	= result % 50000 % 10000 / 5000;
				    chanwon 	= result % 50000 % 10000 % 5000 / 1000;
				    System.out.println("거스름돈 " + result + "원");       
				    System.out.println("오만원 : "+ ohmanwon+ " 장");
				    System.out.println("만원 : "+ manwon + " 장");
				    System.out.println("오천원 : "+ ohchanwon + " 장" );
				    System.out.println("천원 : "+  chanwon + " 장");
			}
			public static void won(int y, int m) { 
				//큰 금액의 동전을 우선적으로 거슬러 줘여한다.
				int[] coinUnit = { 50000, 10000, 5000, 1000};// 배열을 활용 한 배열에 4개의 변수를 집어넣음
				int money = y - m; 							// 마이너스 변수 money 생성	거스름돈 계산한 변수값
				System.out.println(" 지불금액: " + y + " 물건금액:" + m); // money변수로 값을 계산하여출력
				System.out.println("거스름돈 = " + money); // money변수로 값을 계산하여출력
				for(int i = 0; i < coinUnit.length; i++) {
					System.out.println(coinUnit[i]+"원: " + money / coinUnit[i] + "장");
					money %= coinUnit[i]; // ★반복마다 money에 나머지값이 적용되지않으면 최초 거스름돈금액으로만 계산하게됨 ex) 77000원 > 5만원 1장 / 1만원 7장 / 
				}
			}
			}	
			



























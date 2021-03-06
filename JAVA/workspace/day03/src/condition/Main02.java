package condition;

public class Main02 {

	public static void main(String[] args) {
		int point = 85;
		/*
		 *  point 가 70보다 크고, 80이하이면 "C학점입니다."를 출력,
		 *  point 가 70이하 또는 80보다 크면"범위를 벗어났습니다."
		 */
		
		// AND(&&) -> 두 조건이 모두 참이여야 전체가 참 + 활용하면 if문을 여러개쓸필요없음
		if ( point > 70 && point <= 80 ) {
			System.out.println("C학점입니다.");
		}
		
		// OR(||) -> 두 조건중 하나라도 참이면 전체가 참 + 활용하면 if문을 한번에 비교가됨
		if ( point <= 70 || point > 80 ) {
			System.out.println("범위를 벗어났습니다.");
		}	
			
	}

}

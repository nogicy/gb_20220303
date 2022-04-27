package object;
// 2시 30분, 중간체크


class Calc{ // 클래스안에 메서드 만들기
	// 내부에서는 public static 안써도 오류가안생긴다.
	// puls, param int x, int y, return
	public static int puls (int x, int y) {
		int had = x + y;
		System.out.println(had);
		return had;
		
	}
	
	// minus, param int x, int y, return
	public static int minus (int x, int y) {
		int bad = x - y;
		System.out.println(bad);
		return bad;
	}
	// times, param int x, int y, return
	public static int times (int x, int y) {
		int pad = x * y;
		System.out.println(pad);
		return pad;
	}

	// divide, param int x, int y, return
	public static int divide (int x, int y) {
		int kid = x / y;
		System.out.println(kid);
		return kid;
		
	//강사의답
	}	
	int divide1( int x, int y) {
		int result = 0;
		if( y != 0 ) {
			result = x / y;
		}
		return result;
	}
	
	
}




public class Main04 {

	public static void main(String[] args) { // 클래스.메서드(파라미터1, 파라미터2);
		// 객체생성
		Calc c = new Calc();
		
		// plus
		Calc.puls(5, 5);
		
		// 강사의답
		int p = c.puls(5, 5);
		System.out.println("5 + 5 = " + p);
		
		// minus
		Calc.minus(20, 10);
		
		// 강사의답
		int b = c.minus(20, 10);
		System.out.println("20 - 10 = " + b);
		
		// times
		Calc.times(2, 5);
		
		// 강사의답
		int d = c.times(2, 5);
		System.out.println("2 * 5 = " + d);
		
		// divide
		Calc.divide(200, 20);
		
		// 강사의답
		int a = c.divide1(200, 20);
		System.out.println("200 / 20 = " + a);
		
	}

}

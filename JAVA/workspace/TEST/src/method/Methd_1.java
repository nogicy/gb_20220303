package method;

public class Methd_1 {

	public static void main(String[] args) {
	
		Stringtype();
		System.out.println(one());
		System.out.println(one1());
		System.out.println(one2());
		System.out.println(one2());
		line();
		plus(1, 2);
		System.out.println(beak());;
		all(10, 9);
		all(1, 8);
		all(5, 7);
		
		
		
	}
	public static void line () { // 줄긋기용
		System.out.println("--------------------------");
	}
		/*
		 * 문제 1, "Hello, World~" , " 메서드가 호출되었습니다. " 를
		 * 출력하는 메서드를 각각 만들어 호출하세요
	     */
		
		public static void Stringtype () { // ver.1
			System.out.println(" Hello " + " World " + " 메서드가 출력되었습니다. ");
		}
		public static String one () { // ver.2
			return " Hello " + " World " + " 메서드가 출력되었습니다. ";
		}
		public static String one1 () { // ver.3
			String x = " Hello "; String y = " World "; String z = " 메서드가 출력되었습니다. "; 
			return x + y + z;
		}
		public static String one2 () { // ver.4
			String x, y, z; 
			x = " Hello "; y = " World "; z = " 메서드가 출력되었습니다. "; 
			return x + y + z;
		}
		
		/*
		 * 문제2, 반환값이 없고 받는 인자값이 2개 있는 덧셈 메서드를 구현하여
		 * 인자값이 2개를 출력하여라
		 */
		public static void plus (int x, int y) {//ver.1
			int ivent = x + y;
			System.out.println(ivent);
		}
		
		/*
		 * 문제3, 반환 값이 있고 받는 인자값이 없는 메서드를 구현하세요.
		 */
		public static int beak ( ) {
			int x = 100;
			return x;
		}
		
		/*
		 * 문제4, 반환값이 있고, 받는 인자값이 있는 메서드를 구현해보세요. 
		 */
		public static int all(int x, int y) {
			int admin = x - y;
			System.out.println(admin); // 출력까지 한번에 넣을수있음
			return  admin;
		}
		

}

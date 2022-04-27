package Static;

public class Calc {
	private static Calc current;
	
	public static Calc getInstance() {
		// ----------------- 싱글톤 객체 생성을 위한 준비 시작 ----------------------
		if( current == null) {
			current = new Calc();
		}
		
		return current;
	}
	public static void freeInstance() {
		current = null;
	}
	
	private Calc() {
		super();
	}
	// ---------------------싱글톤 객체 생성을 위한 준비 끝 ------------------------
	
	// 이 클래스가 구현해야 하는 기능
	public void puis(int x, int y) {
		int z = x + y;
		System.out.println( x + " + " + y + " = " + z);
	}
	public void minus(int x, int y) {
		int z = x - y;
		System.out.println( x + " - " + y + " = " + z);
	}
}

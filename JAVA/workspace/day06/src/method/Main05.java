package method;

/*
 * 문제 1, "Hello, World~" , " 메서드가 호출되었습니다. " 를
 * 출력하는 메서드를 각각 만들어 호출하세요
 *
 */

public class Main05 {

	public static void main(String[] args) {
		helloworld();
		showMsg();
		returnM();
	
	}
	public static void helloworld() {
		System.out.println("Hello, world~");
	}
	
	public static void showMsg() {
		System.out.println("메서드가 호출되었습니다. ");
	}
	public static String returnM() {
		return "문자열";
	}
}


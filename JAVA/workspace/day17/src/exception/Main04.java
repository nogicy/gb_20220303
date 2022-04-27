package exception;

public class Main04 {
	
	public static void main(String[] args) {
		/*
		 * try ~ catch 블록으로 예외처리가 적용된 경우에는
		 * 에러가 발생허다러도 프로그램 자체가 다운되지는 않는다.
		 */
		int[] arr = new int [3];
		
		try {
			
		for(int i = 0; i <5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
			}
		} catch( NumberFormatException e) {
			System.out.println(" 에러가 발생했습니다. ");
			System.out.println("원인 :  " + e.getLocalizedMessage());
			e.printStackTrace();
				
		}			
		
		System.out.println("--------------- 프로그램 종료 ------------------");
}

}

package helper;


public class Main {

	public static void main(String[] args) {
		// 다섯자리의 인증번호 생성하기
		
		System.out.println("----------------xxx xxx사이트 입니다. -------------");
		System.out.print(" 인증번호를 입력해주세요\n ");
		String authNum = " ";
		
		for( int i = 0; i < 5; i++) {
			authNum += Util.getInstance().random(0, 9);
		}
		System.out.println(" 인증번호 = " + authNum);
		System.out.println(" 제한시간내에 입력해주세요. ");
		System.out.println("----------------xxx xxx사이트 입니다. -------------");
	}

}

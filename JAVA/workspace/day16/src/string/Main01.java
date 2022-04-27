package string;

public class Main01 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디와 도메인을 구별하기
		
		// 이메일 주소 정의
		// split 사용금지
		String email = "student@java.com";
		
		// "@"가 나타나는 위치 얻기
	      int at = email.indexOf("@");
	      
	      // 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
	      String ID2 = email.substring(0, at);
	      System.out.println("ID2 : " + ID2);
	      
	      // "@"가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
	      String Domain2 = email.substring(at + 1);
	      System.out.println("Domain2 : " + Domain2);
	}

}

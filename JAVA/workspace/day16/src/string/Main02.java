package string;

import java.util.Iterator;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호에서 생년월일을 추출하기
		 *  - 8005011234567 -> 1980년 05월 01일 남자
		 *  - 뒷부분 첫 글자	: 1, 2 : 19~ / 3,4 : 20~
		 *  				: 1, 3 : 남성 / 2, 4 : 여성
		 */
		
		String number = "8005011234567";
		
		// 주민번호를 년, 월, 일 단위로 각 두글자씩 자르기
		String yy = number.substring(0, 2);
		String mm = number.substring(2, 4);
		String dd = number.substring(4, 6);
		
		// 뒷부분의 첫글짜는 성별코드이므로 별도로 추출
		String gd = number.substring(6, 7); // 조건문으로 년도 구분/젠더구분
		
		//태어난 년도의 판별
		if(gd.equals("1") || gd.equals("2") ) {
			yy = "19" + yy;
		}else if(gd.equals("3") || gd.equals("4") ) {
			yy = "20" + yy ;
		}else {
		}
	
		// 성별
		String gender = "남자";
		if(gd.equals("2") || gd.equals("4")) {
			gender = "여성";
		}
		//형식에 맞는 내용출력
		System.out.printf("%s년 %s월 %s일 %s", yy, mm, dd, gender);
		}
	}
	
		
		





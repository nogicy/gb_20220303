package pattern;

import java.util.regex.Pattern;

public class RegexHelper {
	/*
	 * 1. 싱글톤
	 * 2. boolean is Value(String str)	, str : 검사할 문자열, 공백, null체크
	 * 3. bpplean isNum(String str)		, str : 검사할 문자열, 숫자형식 검증체크
	 * 4. bpplean isEng(String str)		, str : 검사할 문자열, 영문인지 검증체크
	 * 5. bpplean isKor(String str)		, str : 검사할 문자열, 한글인지 검증체크
	 * 6. bpplean isEngNum(String str)	, str : 검사할 문자열, 영문/숫자인지 검증체크
	 * 7. bpplean isKorNum(String str)	, str : 검사할 문자열, 한글/숫자인지 검증체크
	 * 8. bpplean isEamil(String str)	, str : 검사할 문자열, email인지 검증체크
	 * 9. bpplean isCellPhone(String str), str : 검사할 문자열, 휴대전화번호 인지 검증체크
	 * -----------------------------------------------------------------------
	 * mian() class에서 해당 메서드 사용
	 *  
	 * 
	 */

	//객체생성시작
	private static RegexHelper current;
    
    public static RegexHelper getInstance() {
    	if(current == null) {
    		current = new RegexHelper();
    	}
    	return current;
    }
    
    public static void freeInstance() {
    	current = null; // 메모리지우기
    }
    private RegexHelper() {
    	super(); // 생략가능
    }
    // 객체생성끝
    
 // boolean isValue(String str)	, str : 검사할 문자열, 공백, null체크
 	/*
 	 *  주어진 문자열이 공백이거나 null인지를 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 공백, null이 아닐 경우 true 리턴 
 	 */
 	public boolean isValue( String str ) {
 		boolean result = false;
 		
 		if( str != null ) {
 			result = !str.trim().equals("");
 		}
 		
 		return result;
 	}
 	
 	// boolean isNum(String str)		, str : 검사할 문자열, 숫자형식 검증체크
 	/*
 	 * 숫자 모양에 대한 형식 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
 	 */
 	public boolean isNum( String str ) {
 		boolean result = false;
 		
 		if( isValue(str) ) {
 			result = Pattern.matches("^[0-9]*$", str);
 		}
 		
 		return result;
 	}
 	
 	// boolean isEng(String str)		, str : 검사할 문자열, 영문인지 검증체크
 	/*
 	 * 영문으로만 구성되어있는지에 대한 형식 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
 	 */
 	public boolean isEng( String str ) {
 		boolean result = false;
 		
 		if( isValue(str) ) {
 			result = Pattern.matches("^[a-zA-Z]*$", str);
 		}
 		
 		return result;
 	}
 	
 	// boolean isKor(String str)		, str : 검사할 문자열, 한글인지 검증체크
 	/*
 	 * 한글로만 구성되어있는지에 대한 형식 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
 	 */
 	public boolean isKor( String str ) {
 		boolean result = false;
 		
 		if( isValue(str) ) {
 			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
 		}
 		
 		return result;
 	}
 	
 	// boolean isEngNum(String str)	, str : 검사할 문자열, 영문/숫자 인지 검증체크
 	/*
 	 * 영문과 숫자로만 구성되어있는지에 대한 형식 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
 	 */
 	public boolean isEngNum( String str ) {
 		boolean result = false;
 		
 		if( isValue(str) ) {
 			result = Pattern.matches("^[a-zA-Z0-9]*$", str);
 		}
 		
 		return result;
 	}
 	
 	// boolean isKorNum(String str)	, str : 검사할 문자열, 한글/숫자인지 검증체크
 	/*
 	 * 한글과 숫자로만 구성되어있는지에 대한 형식 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
 	 */
 	public boolean isKorNum( String str ) {
 		boolean result = false;
 		
 		if( isValue(str) ) {
 			result = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str);
 		}
 		
 		return result;
 	}
 	
 	// boolean isEamil(String str)	, str : 검사할 문자열, email인지 검증체크
 	/*
 	 * email로만 구성되어있는지에 대한 형식 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
 	 */
 	public boolean isEamil( String str ) {
 		boolean result = false;
 		
 		if( isValue(str) ) {
 			result = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
 		}
 		
 		return result;
 	}
 	
 	// boolean isCellPhone(String str), str : 검사할 문자열, 휴대전화번호 인지 검증체크
 	/*
 	 * 휴대전화번호로만 구성되어있는지에 대한 형식 검사
 	 *  @param	str 	: 검사할 문자열
 	 *  @return	boolean	: 형식에 맞을 경우 true, 맞지 않을 경우 false
 	 */
 	public boolean isCellPhone( String str ) {
 		boolean result = false;
 		
 		if( isValue(str) ) {
 			result = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
 		}
 		
 		return result;
 	}
 }
    //검증체크
//    public void isValue(String str) {
//    	boolean isValue = Pattern.matches("\\S+", str);
//    	if( !isValue ) {System.out.println("공백을 없애주세요");}
//    	return;
//    }
//    // 숫자여부 검사
//    public void isNum(String str) {
//    	boolean isNum = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str);
//    	if( !isNum ) {System.out.println("숫자만 입력해주세요");}
//    	return;
//    }
//    // 영문여부 검사
//    public void isEng(String str) {
//    	boolean isEng = Pattern.matches("^[a-zA-Z]*$", str);
//    	if( !isEng ) {System.out.println("영어만 입력해주세요");}
//    	return;
//    }
//    // 한글여부 검사	
//   	public void isKor(String str) {
//   		boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
//   		if( !isKor ) {System.out.println("한글만 입력해주세요");}
//   		return;
//   	}
//   	// 영문숫자 검사
//   	public void isEngNum(String str) {
//   		boolean isEngNum = Pattern.matches("^[a-zA-Z0-9]*$", str);
//   		if( !isEngNum ) {System.out.println("영어와 숫자만 입력해주세요");}
//   		return;
//   	}
//   	// 한글숫자 검사
//   	public void isKorNum(String str) {
//   		boolean isKorNum = Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str);
//   		if( !isKorNum ) {System.out.println("한글과 숫자만 입력해주세요");}
//   		return;
//   	}
//   	// 이메일 검사
//   	public void isEamil(String str) {
//   		boolean isEamil = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str);
//   		if( !isEamil ) {System.out.println("이메일 형식이 올바르지 않습니다.");}
//   		return;
//   	}
//   	// 전화번호 검사
//   	public void isPhone(String str) {
//   		boolean isPhone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);
//   		if( !isPhone ) {System.out.println("전화번호가 올바르지 않습니다.");}
//   		return;
//   	}	  
//}
    

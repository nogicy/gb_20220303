package calendar;

import java.util.Calendar;

public class Main05 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 이번 달은 몇 주로 되어 있는가?
		int week_count = cal.getActualMaximum( Calendar.WEEK_OF_MONTH);
		System.out.println("이번달은" + week_count + "주로 되어있다.");
		
		// 이번 달은 몇 일까지 있는가?
		int day_count = cal.getActualMaximum( Calendar.DAY_OF_MONTH);
		System.out.println("이번달은" + week_count + "일 까지있다.");
		
		// 이번 달은 무슨 요일부터 시작하는가?
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int first_day = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(first_day);
		
		// 요일에 해당하는 인덱스(일=1 ~ 토=7)
		int day = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println("요일 인덱스 = " + day);
				
		// 요일을 출력하기
		String[] day_name = {"월", "화","수","목","금","토","일"};
		System.out.println("요일 = " + day_name[day-1]);
		
		// 이번 달은 몇 주 인가 -> 행
		// 일~토 요일 -> 열
		int[][] data = new int[week_count][7];
		
		// 출력할 날짜 값 - > 이 값이 1씩 증가
		int count = 1;
		
		// "주"수 만큼 반복한
		for(int i = 0 ; i<data.length; i++) {
			
			// 일~토 요일 까지 반복한다.
			for(int j = 0; j < data[i].length; j++) {
				
				if( i == 0 && j < first_day -1 ) {
					// i가 0 -> 첫 번쨰 주
					// j의 값은 요일에 대한 체크
					// - > 이번달 첫 주에서 1일이 시작되는 요일 전까지
					data[i][j] = 0;
				}else if( count > day_count ) {
					//이번 달의 마지막 날을 초과한 경우
					data[i][j] = 0;
				}else {
					//그 외의 경우에는 날짜값을 복사하고,
					// 날짜값을 1 증가시킨다.
					data[i][j] = count++;
				}
			}
		}
		// 배열 출력을 위한 반복문
		for(int i = 0; i <day_name.length; i++) { // 한글 월~일 출력
			System.out.print(day_name[i] + "\t");
		}
		System.out.println(" \n ");
		for( int i = 0; i < data.length; i++) {
			for( int j = 0; j < data[i].length; j++) {
				if( data[i][j] == 0) {
					System.out.printf("\t");
				}else {
					System.out.printf("%2d\t", data[i][j]);
				}
			}
			System.out.println( );
		}
	}	
}

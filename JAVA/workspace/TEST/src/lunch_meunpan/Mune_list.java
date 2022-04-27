package lunch_meunpan;

import java.util.Random;

public class Mune_list {
	String mune[] = new String[10];
	String munebook[] = {"김밥", "초밥", "순대국밥", "김치찌게", "제육볶음", "햄버거", "쉐이크", "백반정식", " 생선구이", "자장면"}; // 메뉴를 배열에 넣기
	String all;
	int num;
	int[] num1 = new int[10];
	
	void list() { // 점심랜덤메소드 후보 1 단점 : 길다.
//		System.out.println("10개만 입력됩니다!!");
		Random rd = new Random();
		for(int i = -1; i<mune.length; i++) {
			num = rd.nextInt(20);
			
			if( num == 1) {mune[0] = "라면";}
			else if(num == 2) {mune[0] = "짜장면";}
			else if(num == 3) {mune[0] = "짬봉";}
			else if(num == 4) {mune[0] = "볶음밥";}
			else if(num == 5) {mune[0] = "초밥";}
			else if(num == 6) {mune[0] = "김밥";}
			else if(num == 7) {mune[0] = "비빔밥";}
			else if(num == 8) {mune[0] = "된장찌게";}
			else if(num == 9) {mune[0] = "돼지고기 김치찌게";}
			else if(num == 10) {mune[0] = "콩비지찌게";}
			else if(num == 11) {mune[0] = "참치 김치찌게";}
			else if(num == 12) {mune[0] = "햄버거";}
			else if(num == 13) {mune[0] = "죽";}
			else if(num == 14) {mune[0] = "제육볶음";}
			else if(num == 15) {mune[0] = "오징어덮밥";}
			else if(num == 16) {mune[0] = "삼겹살";}
			else if(num == 17) {mune[0] = "생선구이";}
			else if(num == 18) {mune[0] = "백반정식";}
			else if(num == 19) {mune[0] = "쉐이크";}
			else { 
				break;
		}
//			System.out.println("오늘은 굶어볼까요...?"); // 자동컨티뉴가됨..?
		}
	}
	void munepan() { // 점심메뉴메소드 후보 2 단점 : 한번에 보기는어렵다. 이해하지않으면 바로보고뭔지알지못함
		Random rd = new Random(); // 이거랑 3번째 출력시킬 배열칸안에서 랜덤 넥스트인드 쓰면 랜덤배열함수뽑아줌
		System.out.println(" ");
		System.out.println(" 오늘은 "+ munebook[rd.nextInt(5)] + " 먹자!! ");// 대사변경은 여기서 짧게하는거찾느라 시간엄청걸리네..
		System.out.println(" ");
	}
	
	void print() {
		list();
		System.out.println(" ");
		System.out.println(" 오늘은 " + mune[0] + " 먹자!!! " );
		System.out.println(" ");
	}
	void println() {
		munepan();
	}
}

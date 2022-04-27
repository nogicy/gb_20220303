package lunch_meunpan;

import java.util.Scanner;

import exercise_record_application.copy.copy.Mune02.StuCont;

public class Suver_01 {
	
	public static void main(String[] args) {
		// 처음 인사말나오고 자동으로 메뉴골라주는 거?
		int num1 = 0;
		
		
		
		
		// 시작화면 구현
		Mune_list ml = new Mune_list();
		Scanner sc = new Scanner(System.in); // 메서드에서 불러올수있다
		
		int select = -1;
		StuCont cont = new StuCont();
		Scanner cont = new Scanner(System.in);
		while (true) {
			System.out.println("성적관리 프로그램");
			System.out.println("1.추가 2.검색 3.전체검색 4.수정 5.삭제 0.종료");
			select = sc.nextInt();
			
			if (select == 1) {
				cont.insert();
			} else if (select == 2) {
				cont.serch();
			} else if (select == 3) {
				cont.serchAll();
			} else if (select == 4) {
				cont.modify();
			} else if (select == 5) {
				cont.delete();
			} else if (select == 0) {
				System.exit(0);
			}
			break;
		}
	}
}
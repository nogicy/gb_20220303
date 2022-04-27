package muyaho;

import java.util.Random;

public class Twoo_suver extends One_suver{

	char doo[] = new char [3];
	
	public Twoo_suver(int yoo) {
		super(yoo);
	}

	void Rabdom() {
		Random rd = new Random();
		for(int i = 0; i < 4; i++) { // 조건식 숫자는 재반복횟수로 변경가능
			
			yoo = rd.nextInt(6); // 랜덤 숫자수치를 구해서 자동으로 랜덤숫자출력
			
			if( yoo == 1) {doo[0] = '도';}
			else if(yoo == 2) {doo[0] = '개';}
			else if(yoo == 3) {doo[0] = '걸';}
			else if(yoo == 4) {doo[0] = '윷';}
			else if(yoo == 5) {doo[0] = '모';}
			else {
			System.out.println("낙! 다시던지세요"); // 자동컨티뉴가됨..?
			}
			
		}
	
	} 
	void pirnt() {
		Rabdom();
		System.out.println("당신이 나온것은!! : " + doo[0]);	
			
	}
}

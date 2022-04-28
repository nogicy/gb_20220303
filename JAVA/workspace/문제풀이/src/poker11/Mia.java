package poker11;

import java.util.Random;

/*
 * [그림]과 같이 4개의 슈트(모양: S, D, H, C)와 13개의 랭크(값 : A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K)로 
 * 구성된 52장의 카드가 있다. 
 * S = 스페이드  D = 다이아  H = 하트  C = 클로버
 * 첨부된 [그림] 참조
 * 52장의 카드에서 임의의 5장의 카드를 주었을 때 카드 핸드(선택된 5장의 카드)의 종류가 9종류가 있다. 아래는 9종류의 카드 핸드를 설명한다. 
 *
 * 1. Straight Flush : 모두 동일한 슈트에 랭크(값)가 모두 연속적이다
 * (여기서는 로얄 플러쉬를 포함한다. 로얄 플러쉬는 모두 동일한 슈트에 T, J, Q, K, A를 갖는다).
 * 2. Four of a Kind : 5장 중 4개의 랭크(값)가 모두 같다.
 * 3. Full House : 3장의 동일한 랭크(값)와 다른 랭크(값)의 동일한 2장으로 구성된다.
 * 4. Flush : 5장이 모두 동일한 슈트다.
 * 5. Straight : 다른 슈트가 섞여있으며 랭크(값)가 모두 연속적이다.
 * 6. Three of a kind : 동일한 랭크(값)가 3장이다(1,2,3,3,3).
 * 7. Two pair : 동일한 랭크(값) 2장씩 두개의 랭크다(2,6,6,3,3).
 * 8. One pair : 동일한 랭크가 2장이다(2,4,5,5,7).
 * 9. High card : 1~8번에 해당하지 않는다.  
 * 
 * 예시) 입력 - S5 S6 S7 S8 S9 출력 - Straight Flush다. 
 * 
 * <입력방법 >
 * 첫 줄에는 테스트 케이스가 개수다.(생략가능)
 * 두 번째 줄부터는 5개의 카드가 공백과 함께 주어진다. 
 * 
 * 
 * 출처 - https://swexpertacademy.com/main/main.do
 * 		SW ExpertAcademy 9760. Poker Game
 * 
 */
public class Mia {
	char[][] bord = new char[][]{{'S', 'D', 'H', 'C'},{'A','2','3','4','5','6','7','8','9','T','J','Q','K'}};  // 카드 모양 [] 카드 번호[]
	Random rd = new Random();
	
	public void shuffle() {
		
	for(int i = 0; i < bord.length; i++) {
		for(int j = 0; j <bord.length; j++ ) {
			if(bord[i][j])
			
		}
	}
	}
}

package lotto;

import java.util.Random;

/*
*어제, 지민이는 몰래 리조트에 갔다가 입구에 걸려있는 복권 광고를 하나 보았다.
*
*“1부터 N까지의 수 중에 서로 다른 M개의 수를 골라보세요. 저희도 1부터 N까지의 수 중에 서로 다른 M개의 수를 고를건데, 적어도 K개의 수가 같으면 당첨입니다.!”
*
*지민이는 돌아오면서 자신이 복권에 당첨될 확률이 궁금해졌다.
*
*지민이가 복권에 당첨될 확률을 구하는 프로그램을 작성하시오.
*
*입력
*첫째 줄에 세 정수 N, M, K가 주어진다.
*
*출력
*첫째 줄에 지민이가 복권에 당첨될 확률을 출력한다. 절대/상대 오차는 10-9까지 허용한다.
*
*제한
*2 ≤ N ≤ 8
*1 ≤ M ≤ N-1
*1 ≤ K ≤ M
*/

public class Random_lotto {
	

	public static void main(String[] args) {
		int[] N = new int[8];	// 본인이 고르는 숫자 개수
		int ran = (int)(Math.random()*8)+1;
		N [0] = ran; 
		int[] M = new int[8];	//	상대방이 고르는 숫자 개수
//		int[] M = new int[]{1,2,3,4,5,6,7,8};	//	상대방이 고르는 숫자 개수
		
		boolean [] K = new boolean[ran];	// 당첨기준 동일한 k개수 참과 트루로 결과출겨
		int sum = 0;
		int num = 0;
		
		//1 본인픽 숫자개수
		for(int i = 2; i < N.length; i++) {
			ran = (int)(Math.random()*8)+1;
			for(int j = 0; j < M.length; j++) {
			ran = (int)(Math.random()*8)+1;
			if(N[i] == M[j]) { // N과 M이 같다면 트루라는값을 K에적립해준다.
			K[l] = true;
			} else if(N[i] != M[j]){ // 삼중폴문을써야하는데 어렵긴한듯
			K[l] = false;	
			} else {
		} 
	}
		for(int i = 2; i < K.length; i++)
		System.out.println(K[i]+" ");
	}
	}
}
//int num[] = new int[6];
//int ran = (int)(Math.random()*8)+1;
//num[0] = ran;
//for(int i = 1; i < num.length; i++) {
//	ran = (int)(Math.random()*8)+1;
//	for(int j = 0; j < num.length; j++) {
//		if(num[j] == ran) {
//			i=0;
//			break;
//		}
//	}num[i]=ran;
//}
//for(int i = 1; i < num.length; i++) 
//	System.out.println(num[i]+" ");
//	}
//}

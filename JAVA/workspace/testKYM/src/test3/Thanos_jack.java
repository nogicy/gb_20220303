package test3;
/* 
타노스는 프로그램의 균형을 위해서는 리스트의 원소 절반을 무작위로 삭제해야 한다고 믿고 있다.
타노스가 손가락을 튕겼을 때(프로그램을 실행했을 때) 입력된 리스트에서 
절반의 원소를 무작위로 삭제하여 리턴하는 인피니티 건틀렛 프로그램을 작성하시오.
(무작위 삭제이므로 입력값이 같아도 출력값이 매번 달라야 합니다)
(Scanner 이용)

입력 예시
[2, 3, 1, 6, 5, 7]

출력 예시 1
[2, 5, 7]

출력 예시 2
[3, 6, 5]

* 참고: 리스트의 원소가 홀수개일 경우 절반의 확률로 절반보다 많은 원소가 삭제되거나 
         절반보다 적은 원소가 삭제되어야 합니다.
         (만약 리스트의 원소가 7개라면 절반의 확률로 3개 또는 4개의 원소가 삭제됨)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Thanos_jack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int [] num = new int [7];
		int sum = 0;
		
		int[] Arr = {1, 2, 3, 4, 5, 6,7};
		for(int i=0; i<Arr.length; i++)
			System.out.print(Arr[i] + " ");
		List<String> list = new ArrayList<String>();
		for(int i=0; i<Arr.length; i++)
			if(!list.contains(Arr[i]))	// list에 포함되어있는지 아닌지 체크
				list.add(i, i);		// 해당 값이 없으면 넣기
		
		Collections.sort(list);
		for(String i : list)
			System.out.print(i + " ");
			
	}



		
		
//		for(int i = 0; i < num.length; i++) {
//			num[i] = rd.nextInt(7);
//			if(num[i] %2 == 0) {
//				sum = num[i];
//			}else if(num[i] %2 != 0){
//				sum = num[i];
//			} else {
//				System.out.println(" 다시시도하세요 ");				
//				sum = num[i] - num[i];
//			}
//			System.out.println(sum);
		

		
//		for(int j= 0; j < num.length; j++) {
//			num[j] = (int)(Math.random() * 5) +1;			
//			sum = num[j];
//			System.out.println(sum);
		}
//		
		
//		}
//		int [] temp = new int[5];
//		
//		int count = 0;
	 	// 10개의 난수를 저장 받을 변수를 생성
//			int[] arr = new int[10];
//	      
//			// 1 ~ 5 까지의 난수 10개를 0 부터 9 인덱스에 저장 받고
//			for(int i = 0; i < arr.length; i++){
//				arr[i] = (int)(Math.random() * 5) + 1;
//			}
//			
//	        	// 값이 잘 들어갔나 확인
//			System.out.println(Arrays.toString(arr));
//			
//	        	// 중복이 배제된 값을 저장받을 배열
//			int[] temp = new int[5];
//	      	
//	            // 중복이 배제된 회수
//			int count = 0;
//			
//	        	// 중복을 걸러주는 부분
//			for(int i = 0; i < arr.length; i++){
//				boolean flag = false;
//				for(int j = 0; j < temp.length; j++){
//					if(arr[i] == temp[j]){
//						flag= true;
//						System.out.println(Arrays.toString(temp));
//					}
//				}
//	            	// 중복이 배제된 값이 저장.
//				if(!flag){
//					temp[count++] = arr[i];
//				}
//			}
//
//			// 0을 배제 해주기 위한 부분
//			int[] result = new int[count];
//			for(int i = 0; i < result.length; i++){
//				result[i] = temp[i];
//			}
//			System.out.println(Arrays.toString(result));
//		

	
	



package test22;

import java.util.Arrays;

public class Loding {
	public static void main(String[] args) {
//		int num = 0; // 합계저장
//		int sum = 20; // 범위가될 숫자 저장
//
//		for(int i = 0; i<sum; i++) {
//			if((i % 2) == 0) { 
//				continue;
//				
//			} else if( (i % 3) == 0) {		
//				continue;
//				
//			}else {
//				num += i;
//			}		
//		}
//		
//		System.out.println("총계" + num);
		int[][] num = {{1,2},{3,4},{5,6}};
//		int[][] num = new int[10][10];
//		System.out.println(Arrays.deepToString(num));
		
		for(int i = 0; i > num.length; i++) {
			int[] innum = num[i];
			for(int j = 0; j > innum.length; j++) {
				System.out.println(innum[j] + " ");
				System.out.println(num);
			}
		}
	}
	
}



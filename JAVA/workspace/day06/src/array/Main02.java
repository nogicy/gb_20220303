package array;

public class Main02 {

	public static void main(String[] args) {
		 // 문제1, num 배열에 저장된 요소의 합을 구하시오
		
		 int[] num = new int[] {22, 3, 8, 12};
		 int sum = 0;
		 for (int i = 0; i < num.length; i++ ) {
			 sum += num[i];
		 }
		 System.out.println("num합계 : " + sum);
		 
		 //강사의 답
		 
		 int sum1 = 0;
		 
		 for (int i = 0; i <num.length; i++ ) {
			 sum1 += num[i];
		 }
		 System.out.println("합계 : " + sum);
		 System.out.println("---------------------------------------");
		 
	
		 // 문제2, num2 배열에 저장된 요소의 합과 평균을 구하시오
		 
		 int[] num2 = new int[] {60, 95, 88};
		 int bum = 0;
		 for (int i = 0; i < num2.length; i++ ) {
			 bum += num2[i];
		 }
		 System.out.println("num2합계 : " + bum + " 평균값 = " + (bum / num2.length));
		 
		 // 강사의 답
//		 int sum2 = 0;
//		 
//		 for(int i =0; i<num2.length; i++) {
//			 sum2 += num2[i];
//		 }
//		 
//		 System.out.println("합게 : " + sum2);
//		 System.out.println("평균 : " + (sum2/num2[]));
//		 System.out.println("---------------------------------------");
		 System.out.println("---------------------------------------");
		 
		 // 문제3, 배열 num3 배열에 저장된 요소의 최대값을 출력하시오.
		 		 
		 int[] num3= {94, 85, 95, 88, 90};
		 int ivent = num3[0]; // 최대값을 받을 변수선언 배열인덱스 0값 참조하기.
		 
		 for ( int i = 1; i<num3.length; i++ ) {
			 if(num3[i]>ivent) {
				 ivent = num3[i];
			 }
		 }
		 System.out.println("num3 배열 최대값 : " + ivent);
		 
		 //강사의 답
		 
		 int max = num3[0];
		 for (int i = 1; i<num3.length; i++ ) {
			 if( max < num3[i]) {
				 max = num3[i];
			 }
		 }
		 System.out.println("num3 배열 최대값 : " + max);
		 System.out.println("---------------------------------------");
		 
		 
		 // 문제4, num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		 
		 int[] num4 = new int[] {22, 3, 8, 12};
		 int holl = 0;
		 int jjak = 0;
			
			
		 
		 System.out.println("홀수의 합 : " + holl + "\n짝수의 합 : " + jjak);
		 
		 //강사의 답
		 
		 int even = 0; // 짝수
		 int odd = 0; // 홀수
		 
		 for( int i = 0; i < num4.length; i++ ) {
			 if(num4[i] % 2 == 0 ) {// 짝수
				 even += num4[i];
			 }else { // 홀수
				 odd += num4[i];
			 }
		 }
		 System.out.println("짝수 : " + even);
		 System.out.println("홀수 : " + odd);
		 
		 
		 
		 }	 
	}





package multex;

import java.util.Iterator;

public class Main03 {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int ivent = 0;
		
		for ( int i = 1; i<=10; i++ ) {
			if ( i % 2 == 1 ) { // 홀수인 조건
			 ivent += i;
		 }
			
		}
		
		System.out.println("1 ~ 10 까지 홀수 값의 합" + ivent );
		System.out.println("-----------------------------" );
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		  int ivent2 = 0;
		  
		  for ( int i = 0; i <= 10; i++ ) {
			  if ( i % 2 == 0 ) { //짝수인 조건
				  ivent2 += i;
			  }
		  }
		  System.out.println("1 ~ 10 까지 홀수 값의 합" + ivent2 );
		  System.out.println("-----------------------------" );
			/*
			 * 문제 3.
			 * 	★★★★★★★★
				★★★★★★★★
				★★★★★★★★
				★★★★★★★★
				★★★★★★★★
				★★★★★★★★
				★★★★★★★★
				★★★★★★★★
			 */
		  for ( int i = 1; i <=8; i++) { // for문이 헷갈리면 엑셀을열고 하나씩대입하며 보면 이해하기쉬움
			  for ( int j = 1; j <=8; j++ ) {
				  System.out.print("★");
			  }
			  System.out.println( "" );
		  }
		  System.out.println("-----------------------------" );
		  
		    /*
			 * 문제 4. 
				★★★★★★★★
				★★★★★★★
				★★★★★★
				★★★★★
				★★★★
				★★★
				★★
				★
			 */
		  for ( int i = 1; i <=8; i++) {
			  for ( int j = i; j <= 8; j++ ) {
				  System.out.print("★");
			  }
			  System.out.println( "" );
		  }
		  System.out.println("-----------------------------" );
		  	
			/*
			 * 문제 5.
				★
				★★
				★★★
				★★★★
				★★★★★
				★★★★★★
				★★★★★★★
				★★★★★★★★
			 */
		  for ( int i = 1; i <=8; i++) {
			  for ( int j = 1; j <=i; j++ ) {
				  System.out.print("★");
			  }
			  System.out.println( "" );
		  }
		  System.out.println("-----------------------------" );
	  		
			/*
			 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
			 * 		  2중 for문, 2중 while문
			 */
		  
		  // for문으로 하면
		  // 결과만 나오는 코드
		  System.out.println("2중 for문");
		  for ( int i = 2; i <= 9; i++) {
			  for( int j = 1; j <= 9; j++) {
				  int k = i*j; // 변수를 만들어 간결하게만듬
				  System.out.println(k);  
			  }
			  System.out.println("-----------------------------");// 반복이 1단씩 끝날때마다 줄이쳐짐  
		  }
		  // 식과 결과가 같이나오는 코드
		  for ( int i = 2; i <= 9; i++) {
			  for( int j = 1; j <= 9; j++) {
				  System.out.println(i + " * " + j + " = " + (i*j)); // 식과 결과를 한번에 출력시켜 변수선언이 필요없음 내부에서 계산하며 출력함
			  }
			  System.out.println("-----------------------------");// 반복이 1단씩 끝날때마다 줄이쳐짐  
		  }
		  
		  // while문으로 하면
		  System.out.println("2중 while문");
		  int i = 2;
		  int j = 1;
		  
		  while ( i <= 9 ) {
			  
			  while ( j <= 9 ) {
				  int k = i * j;
				 System.out.println(i + " * " + j + " = " + k);
				 System.out.println( );
				j++;
			  }
			  System.out.println("-------------------------------");
			  i++;
			  j = 1;//★한번 반복후 1로 초기화 하지않으면 1번만 반복해서 2단만나옴 반복문안에서만 위치하면 위든아래든 상관없음
			  
		  }
			

			
		
		  	
		  	
		  	
		}
			

			}
	

	

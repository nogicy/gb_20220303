package multiex;

public class Main01 {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		 int ivning = 0;
		 for (int i = 0; i <= 10; i++) {
			 if ( i % 2 == 1 ) {
				 ivning += i;
			 }
		 }
		 System.out.println("홀수의 합: " + ivning);
		 
		 System.out.println("---------------------");
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		 int night = 0;
		 for (int j = 0; j <= 10; j++ ) {
			  if ( j % 2 == 0 ) {
				  night += j;
			  }
		  }
		  System.out.println("짝수의 합: " + night);
		  
		  System.out.println("---------------------");
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
//		  	int star = 0; //ver.1
//		  	for ( int i = 0; i <= 9; i++) {
//		  		star = 8 * i;
//		  		System.out.println("★★★★★★★★");
//		  	}
		  	//5번문제 구글링한거 응용한거
		  	for (int i = 1; i<=8; i++ ) {
		  		for(int j = 1; j<=8; j++) {
		  			System.out.print("★");
		  		}
		  		System.out.println();
		  	}
		  				
		  	System.out.println("---------------------");
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
		  		for (int i = 8; i<=1;i--) {
		  			for(int j=1; j<=i; j++) {
		  				System.out.print("★");
	  			}
	  			System.out.println();
	  	}
	  		System.out.println("---------------------");
		  	
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
		  	// 구글링해본거 
//		  		for (int i = 1; i<=8;i++) {
//		  			for(int j=1; j<=i; j++) {
//		  				System.out.print("★");
//		  			}
//		  			System.out.println();
//		  	}
//		  		System.out.println("---------------------");
			/*
			 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
			 * 		  2중 for문, 2중 while문
			 */
			int i,j;
			i =2;
			j =1;
			
			while(i<10) {
				
			while(j<10) {
			System.out.println(i + " * " + j + " = " + (i*j));
			j++;
			}
			j = 1;
			i++;
			System.out.println( );
			}
			System.out.println("-----------------------------");
	  		
	  		
			

			
		
		  	
		  	
		  	
		}
			

			}
	

	

package study_4_2;

import java.util.Scanner;

/*
 * 2017년에 이어, 2018년에도 카카오 코드 페스티벌이 개최된다!
 * 
 * 카카오 코드 페스티벌에서 빠질 수 없는 것은 바로 상금이다. 
 * 2017년에 개최된 제1회 코드 페스티벌에서는, 본선 진출자 100명 중 21명에게 아래와 같은 기준으로 상금을 부여하였다.
 * 
 * 2018년에 개최될 제2회 코드 페스티벌에서는 상금의 규모가 확대되어, 본선 진출자 64명 중 31명에게 아래와 같은 기준으로 상금을 부여할 예정이다.
 * 
 * 제이지는 자신이 코드 페스티벌에 출전하여 받을 수 있을 상금이 얼마인지 궁금해졌다. 
 * 그는 자신이 두 번의 코드 페스티벌 본선 대회에서 얻을 수 있을 총 상금이 얼마인지 알아보기 위해, 상상력을 발휘하여 아래와 같은 가정을 하였다.
 * 제1회 코드 페스티벌 본선에 진출하여 a등(1 ≤ a ≤ 100)등을 하였다. 단, 진출하지 못했다면 a = 0으로 둔다.
 * 제2회 코드 페스티벌 본선에 진출하여 b등(1 ≤ b ≤ 64)등을 할 것이다. 단, 진출하지 못했다면 b = 0으로 둔다.
 * 제이지는 이러한 가정에 따라, 자신이 받을 수 있는 총 상금이 얼마인지를 알고 싶어한다.
 * 
 * 첫 번째 줄에 제이지가 상상력을 발휘하여 가정한 횟수 T(1 ≤ T ≤ 1,000)가 주어진다.
 *
 * 입력
 * 다음 T개 줄에는 한 줄에 하나씩 제이지가 해본 가정에 대한 정보가 주어진다. 
 * 각 줄에는 두 개의 음이 아닌 정수 a(0 ≤ a ≤ 100)와 b(0 ≤ b ≤ 64)가 공백 하나를 사이로 두고 주어진다.
 * 
 * 출력
 * 각 가정이 성립할 때 제이지가 받을 상금을 원 단위의 정수로 한 줄에 하나씩 출력한다.
 * 입력이 들어오는 순서대로 출력해야 한다.
 */
public class Price_jys {
	// 1에서받는거 2에서받는거 
	
	public static void main(String[] args) {
		int count ; // 
		Scanner sc = new Scanner(System.in);
		System.out.println("더할 횟수");
		count = sc.nextInt();
		int [] sum = new int[count];
		if(count <= 1000 && count >= 0)
		{
			for(int i = 0; i < count; i++) 
			{
				int first; // 첫번째 
				int second;// 두번째
				int mum = 0;
				
				System.out.println("첫경기");
				first = sc.nextInt(); // 첫상금
				System.out.println("둘경기");
				second = sc.nextInt();// 둘상금
				
//				if(first >= 0 && first <= 100) 
				{
				if( first == 0 ) {}
				else if(first == 1 ) { mum += 5000000; }
				else if(first <= 3 ) { mum += 3000000; }
				else if(first <= 6 ) { mum += 2000000; }
				else if(first <= 10 ) { mum += 500000; }
				else if(first <= 15 ) { mum += 300000; }
				else if(first <= 21 ) { mum += 10000; }
				else if(first >= 22 ) { }
				}
//				if( second >= 0 && second <= 64 ) 
				{
				if( second == 0 ) {}
				else if(second == 1 ) { mum += 5120000; }
				else if(second <= 3 ) { mum += 2560000; }
				else if(second <= 7 ) { mum += 1280000; }
				else if(second <= 15 ) { mum += 640000; }
				else if(second <= 31 ) { mum += 320000; }
				else if(second >= 32 ) { }
				}
				sum[i] = mum;
			}
			for(int i = 0; i < sum.length; i++)
			{
				System.out.println(sum[i]);
			}
	
		}

	}
}


	
	
	


package Interface;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Character ch = new Character(" 김용사 ");
		Monstar mc = new Monstar(" 슬라임 ");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int x = 0;
		int y = 0;
				System.out.println(" ----------턴제 진행게임----------");
				System.out.println(" 마을밖으로 나왔습니다 모험이 시작됩니다. ");
				System.out.println(" 야생의 적이 나타났습니다. !!");
				System.out.println(" 전투개시 ");
				
				x = rd.nextInt(2); // 턴제 변경칸
				while ( true )
				if (x == 1 && x != 2){
					System.out.println("1 공격. ");
					System.out.println("2 방어. ");
					System.out.println("3 걷기. ");
					System.out.println("4 달리기. ");
					System.out.println("5 아이템줍기. ");
					System.out.println("6 점프하기. ");
					System.out.println("7 종료하기. ");
					int num = sc.nextInt();
					switch (num) {
					case 1:
						ch.attack();
						y = rd.nextInt(5);
						if( y == 1 ) { ch.healing();}
						else if(y == 2 ) ch.powerattack();
						break;
					case 2:
						ch.shield();
						break;
					case 3:
						ch.walk();
						break;
					case 4:
						ch.run();
						break;
					case 5:
						ch.pickup();
						break;
					case 6:
						ch.jump();
						break;
						
					case 7:
						System.exit(0);
						break;
					default:
						System.out.println( "잘못된 입력입니다. " );
						continue;
					}		
					
						if ( x == 2)
						while(true)
						System.out.println(" ");
						System.out.println("1 공격해. ");
						System.out.println("2 방어해. ");
						System.out.println("3 걸어가. ");
						System.out.println("4 달려라. ");
						System.out.println("5 점프해. ");
						System.out.println("6 종료해?. ");
						int sum = sc.nextInt();
						switch (sum) {
						case 1:
							mc.attack();
							x = rd.nextInt(5);
							if( x == 1 ) { mc.healing();}
							else if(x == 2 ) mc.powerattack();
							break;
						case 2:
							mc.shield();
							break;
						case 3:
							mc.walk();
							break;
						case 4:
							mc.run();
							break;
						case 5:
							mc.jump();;
							break;
						case 6:
							System.exit(0);
							break;
							
						default:
							System.out.println( "잘못된 입력입니다. " );
							continue;
					}
		}
	}
}

	

						
						
						
						
						
						
					
			    

				
			



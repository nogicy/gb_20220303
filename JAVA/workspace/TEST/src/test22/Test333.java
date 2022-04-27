package test22;

import java.util.Scanner;

class Number12{
	private int Wal;
	private int Eil;
	
	public int getWal() {
		return Wal;
	}
	public void setWal(int wal) {
		// 월 일은 제한둘껏
		if(Wal > 0 || Wal < 13) {
			this.Wal = wal;
			
		}else {
			System.out.println("잘못된 월 입력입니다.");
			System.exit(0);
		}
	}
	public int getEil() {
		return Eil;
	}
	public void setEil(int eil) {
		int Eill = 0;
        switch(Wal) {
            case 2:
                Eill = 28;
                break;
            case 4: case 6: case 9: case 11:
                Eill = 30;
                break;
            default: Eill = 31;
        }
        if (Eil <= Eill) {
        	this.Eil = eil;      	
        }else{
        	System.out.println("잘못된 날짜!!");
        	System.exit(0);
        }
	}
	
}

public class Test333 {
	
	public static void main(String[] args) {
		// 클래스를 활용해서 날짜 입력받기
		Scanner sc = new Scanner(System.in);
		Number12 nb = new Number12();
		
		System.out.println("개월수를 입력해주세요 : ");
		nb.setWal(sc.nextInt());
		System.out.println("일수를 입력해주세요 : ");
		nb.setEil(sc.nextInt());
		
		System.out.println("오늘은 " + nb.getWal() + "월 " + nb.getEil() + "일 입니다.");
	}

}

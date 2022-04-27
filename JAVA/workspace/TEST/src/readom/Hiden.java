package readom;

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	
	Phone (String name, String tel){
		this.name = name;
		this.tel = tel;
		System.out.println("어서오세요 고객님");
	}
    
    public String getName() {
    	return name;} //getter
    
    public String getTel() {
    	return tel;} //getter
	
	}

public class Hiden {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요. : ");
		System.out.println("전화번호를 입력하세요 : ");
		Phone a = new Phone(sc.next(),sc.next());
		
//		a.getName();
//		a.getTel();
//		System.out.println(a.getName());
//		System.out.println(a.getTel());
		
		System.out.println("이름을 입력하세요. : ");
		System.out.println("전화번호를 입력하세요 : ");
		Phone b = new Phone(sc.next(), sc.next());
		b.getName();
		b.getTel();
		System.out.println(b.name);
		System.out.println(b.tel);
		
		
		sc.close();
		}//main
}

package hiding;

public class Main02 {

	public static void main(String[] args) {
		// Merber 클래스 객체생성
		Merber mb = new Merber("KYM", "Lv.999");
		
		// name, age 각각 출력
		mb.print(); // 생성자 출력문
		
		// 좀 더 보기쉽게 꾸밈
		System.out.println("이름 : " + mb.getName());
		System.out.println("나이 : " + mb.getAge());
//		
//		Merber mb2 = new Merber("333", "불멸" );
//		System.out.print(mb2.all());
//		
//		System.out.println(mb.getAll());
	}

}

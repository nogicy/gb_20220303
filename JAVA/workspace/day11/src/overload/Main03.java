package overload;

public class Main03 {

	public static void main(String[] args) {
		// 생성자가 여러가지 형태로 Overload 되어 있기 때문에
		// 객체를 생성하는 방법이 다양해졌다.
		
		Mumber m1 = new Mumber();
		System.out.println( m1.toString() );
		
		Mumber m2 = new Mumber(25);
		System.out.println( m2.toString() );
		
		Mumber m3 = new Mumber("학생");
		System.out.println( m3.toString() );
		
		Mumber m4 = new Mumber("강사", 30);
		System.out.println( m4.toString() );
		
	}

}








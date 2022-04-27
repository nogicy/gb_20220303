package test1;

public class Main {

	public static void main(String[] args) {
		Calc ca = new Calc("김영민");
		System.out.println(ca.getName());
		int a = 3;
		int b = 10;
		
		// 더하기
		ca.plus(a, b);
		// 뺴기
		ca.minus(b, a);
		// 곱하기
		ca.times(a, b);
		// 나누기(몫)
		ca.division(b, a);
	}

}

package string;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data라고 하는 객체로 생성한 뒤에, 다음의 형태로 출력하시오
		 * (split() 메서드 사용금지)
		 * -----------------------------------------------------------
		 * 파일이름	: food
		 * 확장자 	: jpg
		 * 폴더명  	: D:/photo/2022/travel
		 */
		String data = "D:/photo/2022/travel/food.jpg";
		
		int p = data.lastIndexOf("/");
		int d = data.lastIndexOf(".");
		String name = data.substring(p+1, d);
		String extention = data.substring(d+1);
		String folder = data.substring(0, p);
		
		System.out.println("파일이름\t: " + name + "\n확장자\t: " + extention + "\n폴더명\t: " + folder);
		
	}

}

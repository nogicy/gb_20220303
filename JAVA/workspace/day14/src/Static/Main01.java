package Static;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory(" 자유게시판 " );
		
		Article a1 = new Article(1, "첫 번쨰 글 제목 ", "2022-03-24");
		Article a2 = new Article(2, "두 번쨰 글 제목 ", "2022-03-25");
		Article a3 = new Article(3, "세 번쨰 글 제목 ", "2022-03-26");
		
		
		// 출력 결과에서 모든 객체가 동일한 count값을 갖는다.
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println("--".repeat(100));
		
		Article.setCategory(" 공지사항 ");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}

}

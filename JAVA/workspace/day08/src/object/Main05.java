package object;

class Article{
	int seq; 			// 글번호
	String subject; 	// 글 제목
	String writer; 		// 작성자
	
	/*
	 * 파라미터가 존재하는 생정자
	 * 모든 전역변수를 초기화 = // 생성자메서드에서 작업하면 객체에 새로운 별명을 지을때마다 해당 라인부터는 자동으로초기화된다 기억하자.
	 */
	Article(String subject, String writer, int seq) {
		this.subject = subject;
		this.writer = writer;
		this.seq = seq;
		System.out.println(" 게시판이 생성되었습니다. ");
		
	}
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */

	void print( ) {
		System.out.println( this.subject);
		System.out.println( this.writer);
		System.out.println( this.seq);
	}

}


public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번생성
		Article arc = new Article("첫번쨰 자바 학습", "자바학생", 18);
		
		// 객체.메서드(); (출력 메서드 호출)
		arc.print();
		
		// Article 객체 2번생성
		Article arc2 = new Article("두번쨰 자바 학습", "가방학생", 28);
		
		// 객체.메서드(); ()출력 메서드 호출
		arc2.print();
	}

}

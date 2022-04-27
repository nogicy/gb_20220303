package overload;

public class Article {
	private int seq;			// 글번호
	private String subject; 	// 글제목
	private String writer;		// 글 작성자
	
	// 파라미터가 있는 생성자
	// 여러 경우의 생성자를 만들어두고 상황에따라 처리가 편하다.
	public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public Article(int seq, String writer) {
		this(seq, " 제목없음 ", writer);
//		this.seq = seq;
//		this.subject = " 제목없음 " ; // 입력을 안받았을때 출력되는거
//		this.writer = writer;
	}
	
	public Article(int seq) {
		this(seq, "제목없음", "익명");
//		this.seq = seq;
//		this.subject = " 제목없음 " ;
//		this.writer = " 익명 ";
	}

	
	@Override
	public String toString() {
		return "Artucle [ seq = " + seq + ", subject = " + subject + ", writer = " + writer + " ]";
	}	
	

}

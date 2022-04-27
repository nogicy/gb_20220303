package hiding;
// 1시 50분까지


// 하나의 게시물을 표현하기 위한 JavaBeams
public class Article {
	private int seq;			// 글 번호 
	private String subject; 	// 글 제목
	private String content; 	// 글 내용
	private String writer;		// 작성자
	private int hit;			// 조회수
	private String regDate;		// 작성일자
	
	//파라미터가 있는 생성자
	
	Article(int seq, String subString, String conString, String wrString, int hit, String regString) {
		this.seq = seq;
		this.subject = subString;
		this.content = conString;
		this.writer = wrString;
		this.hit = hit;
		this.regDate = regString;
		System.out.println("----------게시판 상단----------");
	}
//	void println() { // 은닉화 된 전역변수는 get이 아니면 나오지않는다.
//		System.out.println(" 글 번호 : " + this.seq());
//		System.out.println(" 글 제목 : " + this.Subject());
//		System.out.println(" 글 내용 : " + this.Content());
//		System.out.println(" 작성자 : " + this.Writer());
//		System.out.println(" 조회수 : " + this.Hit());
//		System.out.println(" 작성일자 : " + this.RegDate());
//		System.out.println("----------게시판 하단----------");
//	}
	// getter, setter 추가

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public void print() { // 원출력을 만들어두고 나중에 코드만 소환하면 편리하다.
		System.out.println(" 글 번호 : " + getSeq());
		System.out.println(" 글 제목 : " + getSubject());
		System.out.println(" 글 내용 : " + getContent());
		System.out.println(" 작성자 : " + getWriter());
		System.out.println(" 조회수 : " + getHit());
		System.out.println(" 작성일자 : " + getRegDate());
		System.out.println("----------게시판 하단----------");
	}
	
	// main 메서드를 포함하고있는 클래스에서
	public static void main(String[]args) {
		// 객체 생성 및 항목들 출력
	Article ac = new Article(1, "자바기초", "자바는 객체이다.", "KYM", 100, "2022년 03월 17일");	
	ac.print(); // 편리함의 결정체.여러번쓰기 편리함
	}
		
	}
	

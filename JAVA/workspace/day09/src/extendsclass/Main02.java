package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();
		
//		System.out.println("제목을 입력하세요 : ");
//		qna.setTatle(sc.next());
//		System.out.println("번호를 입력하세요 : ");
//		qna.setNum(sc.nextInt());
		
		qna.setNum(1);
		qna.setTatle("철번째 질문.");
		qna.setName("첫번째 답변.");
		
		System.out.println(" 질문/답변[글번호 =]" + qna.getNum());
		System.out.println(" 제목 = "+ qna.getTatle());
		System.out.println(" 답변 = "+ qna.getName());
		
		System.out.println("-----------------------------------");
		qna.setNum(2);
		qna.setTatle("두번째질문.");
		qna.setName("두번째답변.");
		System.out.println(qna.toString());
		System.out.println("====================================");
		
		FileArticle file = new FileArticle();
		
		
		file.setNum(3);
		file.setTatle("세번째 질문");
		file.setName("세번째 답변");
		file.setFileName("jdk.17!");
		System.out.println(file.toString());
		
		
		
	}

}

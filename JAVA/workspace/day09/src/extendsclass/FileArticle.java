package extendsclass;

public class FileArticle extends QNAArticle{ // 상속에 상속이가능하다.
	
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String toString() {
		return "자료실[번호 = " + getNum()
				+ ", 제목 = " + getTatle()
				+ ", 답변 = " + getName()
				+ ", 첨부파일 = " + getFileName()
				+ " ]";	
	}

}

	
	


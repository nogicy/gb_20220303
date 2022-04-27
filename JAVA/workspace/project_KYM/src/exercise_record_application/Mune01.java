package exercise_record_application;

public interface Mune01 {
	
	// 목차역활 메서드
		
		//입력

		public void saveWorker();  //회원 한명의 값 등록 메서드

		//연산
		public void modify(); //특정회원 정보수정 메서드

		public void search(); //이름 값 으로 해당 값을 가진 회원 찾기 & 해당 값 출력 메서드

		//출력
//		public void outputTitle(); 
		
		public void output(); //저장된 정보들의 모든 정보를 출력하는 메서드
		
		public void delete(); // 저장된 지정정보를 삭제 하는메서드

}

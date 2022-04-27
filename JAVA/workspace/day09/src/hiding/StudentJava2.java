package hiding;

public class StudentJava2 {
	// 은닉된 멤버변수 = > 현재 블록 안에서만 접근 가능함
		private String userName	;
		private int userAge;
		
		// Alt + Shift + s = 자동완성
//		public String getUserName() {
//			return userName;
//		}
//		public void setUserName(String userName) {
//			this.userName = userName;
//		}
//		public int getUserAge() {
//			return userAge;
//		}
//		public void setUserAge(int userAge) {
//			this.userAge = userAge;
//		}
		
		
		// getter 메서드 2개
		String getUserName() {
			return userName;
		}
		int getUserAge(){
			return userAge;
		
		}
		
		// setter 메서드 2개
		void setUserName(String setUserName) {
			this.userName = setUserName;
		}
		
		void setUserAge(int setUserAge) {
			this.userAge = setUserAge;
		}
		
		void all () {
			System.out.println(getUserName());
			System.out.println(getUserAge());
		}
	}


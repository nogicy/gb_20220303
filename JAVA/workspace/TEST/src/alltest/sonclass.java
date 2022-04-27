package alltest;

public class sonclass extends Maderclass{
	
	public sonclass(int score) {
		super(score);
	}

	String grade[] = new String[8]; // 학점 배열
	
	void Getgrade() { // 학점계산 메서드
		for(int i =0; i<grade.length; i++) {
			if( score >= 95 && score <= 100 ) grade[i] = "A+";
			else if (score >= 90 && score <= 94 ) grade[i] = "A";
			else if (score >= 85 && score <= 89 ) grade[i] = "B+";
			else if (score >= 80 && score <= 84 ) grade[i] = "B";
			else if (score >= 75 && score <= 79 ) grade[i] = "C+";
			else if (score >= 70 && score <= 74 ) grade[i] = "C";
			else if (score >= 60 && score <= 69 ) grade[i] = "D";
			else  grade[i] = "F";
		}	
	}
	
	void print() { // 출력메서드
		Getgrade(); // 메서드는 이렇게 호출해야한다.이걸몰랐네.
		System.out.println(" 당신의 점수는 : " + score + "점" + "\n 당신의 학점 " + grade[0]);		
	}
}


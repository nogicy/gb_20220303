package Abstract;


	/*
	 * 추상 클래스를 상속 받으면 자식은 부모의
	 * 모든 추상 메서드를 재정의 해야한다.
	 * 
	 */
	
public class Army extends Unit {
	
	public Army(String name) {
		super(name);
	}

	public void attack() {
		System.out.println(this.getName() + " 육상군 공격 : ");		
	}

	public void move() {
		System.out.println(this.getName() +" 육군스킬 발동 : ");
		
	}
	
		
	}
	
















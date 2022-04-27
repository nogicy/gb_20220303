package Abstract;

public class Navy extends Unit{

	public Navy(String name) {
		super(name);
	}
	
	
	public void attack() {
		System.out.println( this.getName() + " 해상군 공격 : ");
	}

	public void move() {
		System.out.println( this.getName() + " 해군 스킬발동 : ");
	}
	
	
}

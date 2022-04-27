package Abstract;

public class AirForce extends Unit{

	public AirForce(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(this.getName() + " 공군 공격준비 : ");
	}

	public void move() {
		System.out.println(this.getName() + " 공군 스킬발동 : ");
	}
	

}

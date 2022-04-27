package Interface;

public class Character implements Action, Move, Fight, allSkill{
	
	private String name;

	@Override
	public void attack() {
		System.out.println(this.name + " 용사의 공격! ");
	}

	@Override
	public void shield() {
		System.out.println(this.name + " 용사의 방어! ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(this.name + "용사가 걷기 시작합니다. . . ");
	}

	@Override
	public void run() {
		System.out.println(this.name + "용사가 달리기 시작합니다. . . ");
	}

	@Override
	public void jump() {
		System.out.println(this.name +"용사가 점프!! ");
	}

	@Override
	public void pickup() {
		System.out.println(this.name + " . . ★ .용사가 아이템을 주웠습니다. ★ . . ");
	}

	@Override
	public void healing() {
		System.out.println(this.name + " 스킬발동 : 용사가 치유스킬을 발동합니다. <회복중>");
	}

	@Override
	public void powerattack() {
		System.out.println(this.name + " 스킬발동 :  용사가 공격을 강화합니다. <데미지증가>");
	}

	public Character(String name) {
		super();
		this.name = name;
	}
	
	

}

package Interface;

public class Monstar implements Move, Fight, allSkill{
	private String mon;

	@Override
	public void attack() {
		System.out.println(this.mon +" 몬스터의 공격! ");
	}

	public String getMon() {
		return mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	@Override
	public void shield() {
		System.out.println(this.mon +" 몬스터의 방어! ");

		
	}

	@Override
	public void walk() {
		System.out.println(this.mon +" 몬스터가 걷기 시작합니다. ");

	}

	@Override
	public void run() {
		System.out.println(this.mon +" 몬스터의 달리기 시작합니다. ");

	}

	@Override
	public void jump() {
		System.out.println(this.mon +" 몬스터의 돌발일격! ");

	}
	@Override
	public void healing() {
		System.out.println(this.mon +" 스킬발동 : 몬스터가 치유스킬을 발동합니다. <재생중>");
	}

	@Override
	public void powerattack() {
		System.out.println(this.mon + " 스킬발동 : 몬스터가 강력한 공격을 준비합니다. <데미지강화>");
	}

	public Monstar(String mon) {
		super();
		this.mon = mon;
	}

}

package ua.stygianw.questtdd;

public class Being {

	protected String name;
	protected int hitPower;
	protected int hp;

	public Being(String name, int hitPower, int hp) {
		this.name = name;
		this.hitPower = hitPower;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hit(Being enemy) {
		enemy.modifyHp(-this.getHitPower());
	}

	public int getHitPower() {
		return hitPower;
	}

	public int getHp() {
		return this.hp;
	}

	public void modifyHp(int healingHp) {
		this.hp += healingHp;
	}

}
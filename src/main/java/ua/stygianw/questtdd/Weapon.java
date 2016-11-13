package ua.stygianw.questtdd;

public class Weapon {

	private final String string;
	private final int damage;

	public Weapon(String string, int damage) {
		this.string = string;
		this.damage = damage;
	}

	public String getString() {
		return string;
	}

	public int getDamage() {
		return damage;
	}
	
}

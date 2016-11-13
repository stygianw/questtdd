package ua.stygianw.questtdd;

public class DamageItem implements Item {

	private final String name;
	private final int damage;

	public DamageItem(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public void useItem(Being being) {
		being.modifyHp(-damage);
	}

	public String getName() {
		return name;
	}

}

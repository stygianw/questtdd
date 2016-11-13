package ua.stygianw.questtdd;

public class HealingItem implements Item {

	private final String name;
	private final int healingHp;

	public HealingItem(String name, int healingHp) {
		this.name = name;
		this.healingHp = healingHp;
		
	}

	public void useItem(Being being) {
		being.modifyHp(getHealingHp());
	}

	public String getName() {
		return name;
	}

	public int getHealingHp() {
		return healingHp;
	}

}

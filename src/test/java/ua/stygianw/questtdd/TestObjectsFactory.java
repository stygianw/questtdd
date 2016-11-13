package ua.stygianw.questtdd;

class TestObjectsFactory {
	static final int ENEMY_HP = 50;
	static final int PLAYER_HP = 100;
	static final int ENEMY_DAMAGE = 10;
	
	
	static Player makeTestPlayer() {
		return new Player("Myname");
	}
	
	static Enemy makeTestEnemy() {
		return new Enemy("Enemy", ENEMY_DAMAGE, ENEMY_HP);
	}
	
}

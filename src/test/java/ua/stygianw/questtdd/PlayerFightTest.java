package ua.stygianw.questtdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerFightTest {

	private static final int ENEMY_HP = 50;
	private static final int ENEMY_DAMAGE = 10;
	private Player player;
	private Enemy enemy;
	
	@Before
	public void setUp() {
		player  = new Player("Myname");
		enemy = new Enemy("Enemy", ENEMY_DAMAGE, ENEMY_HP);
	}
	
	@Test
	public void playerHitTest() {
		assertTrue(enemy.getHp() > 0);
		assertTrue(player.getHp() > 0);
		assertTrue(player.getHitPower() > 0);
		assertTrue(enemy.getHitPower() > 0);
		player.hit(enemy);
		assertEquals(enemy.getHp(), ENEMY_HP - 20);
		enemy.hit(player);
		assertEquals(player.getHp(), 90);
	}
	
	@Test
	public void testWeapon() throws Exception {
		Weapon weapon = new Weapon("Axe", 15);
		player.setWeapon(weapon);
		player.hit(enemy);
		assertEquals(enemy.getHp(), (ENEMY_HP - 35));
		enemy.hit(player);
		assertEquals(player.getHp(), 90);
	}

}

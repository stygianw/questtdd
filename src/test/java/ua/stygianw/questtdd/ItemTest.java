package ua.stygianw.questtdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ua.stygianw.questtdd.Room.RoomBuilder;

public class ItemTest {

	private Player player;
	private Enemy enemy;
	
	@Before
	public void setUp() {
		player = TestObjectsFactory.makeTestPlayer();
		enemy = TestObjectsFactory.makeTestEnemy();
	}
	
	@Test
	public void testHealItem() {
		Item item = new HealingItem("Medkit", 20);
		Room room = new RoomBuilder().setItem(item).constructRoom();
		player.setRoom(room);
		player.applyRoomItem();
		assertEquals(player.getHp(), TestObjectsFactory.PLAYER_HP + 20);
	}
	
	@Test
	public void testDamageItem() throws Exception {
		Item item = new DamageItem("Trap", 20);
		Room room = new RoomBuilder().setItem(item).constructRoom();
		player.setRoom(room);
		player.applyRoomItem();
		assertEquals(player.getHp(), TestObjectsFactory.PLAYER_HP - 20);
	}
	
	@Test
	public void testWeapon() throws Exception {
		Item weapon = new Weapon("weapon", 10); 
	}
}

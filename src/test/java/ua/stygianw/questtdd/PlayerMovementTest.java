package ua.stygianw.questtdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ua.stygianw.questtdd.Room.RoomBuilder;

public class PlayerMovementTest {
	
	
	@SetUp
	public void setUp() {
		
	}
	
	@Test
	public void testMoveForward() {
		Player player = new Player();
		Room forwardRoom = new RoomBuilder().setDescription("ForwardRoom").constructRoom();
		Room room = new RoomBuilder().setDescription("ThisRoom").setForwardRoom(forwardRoom).constructRoom();
		assertNotNull(room.getDescription());
		assertNotNull(forwardRoom.getDescription());
		player.setRoom(room);
		player.moveForward();
		assertEquals(player.getRoom().getDescription(), forwardRoom.getDescription());
	}
	
	@Test
	public void testName() throws Exception {
		
	}
}

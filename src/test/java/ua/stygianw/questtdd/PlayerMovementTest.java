package ua.stygianw.questtdd;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.stygianw.questtdd.Room.RoomBuilder;

public class PlayerMovementTest {
	
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
}

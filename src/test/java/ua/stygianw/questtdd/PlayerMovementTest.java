package ua.stygianw.questtdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ua.stygianw.questtdd.Room.RoomBuilder;

public class PlayerMovementTest {
	
	
	
	public void setUp() {
		
	}
	
	@Test
	public void testMoveForward() {
		Player player = new Player("Newplayer");
		Room forwardRoom = new RoomBuilder().setDescription("ForwardRoom").constructRoom();
		Room room = new RoomBuilder().setDescription("ThisRoom").setForwardRoom(forwardRoom).constructRoom();
		assertNotNull(room.getDescription());
		assertNotNull(forwardRoom.getDescription());
		player.setRoom(room);
		player.moveForward();
		assertEquals(player.getRoom().getDescription(), forwardRoom.getDescription());
	}
	
	@Test
	public void testMoveLeft() {
		Player player = new Player("Newplayer");
		Room leftRoom = new RoomBuilder().setDescription("LeftRoom").constructRoom();
		Room room = new RoomBuilder().setDescription("ThisRoom").setLeftRoom(leftRoom).constructRoom();
		assertNotNull(room.getDescription());
		assertNotNull(leftRoom.getDescription());
		player.setRoom(room);
		player.moveLeft();
		assertEquals(player.getRoom().getDescription(), leftRoom.getDescription());
	}
	
	@Test
	public void testMoveBackwards() {
		Player player = new Player("Newplayer");
		Room backwardRoom = new RoomBuilder().setDescription("BackwardRoom").constructRoom();
		Room room = new RoomBuilder().setDescription("ThisRoom").setBackwardRoom(backwardRoom).constructRoom();
		assertNotNull(room.getDescription());
		assertNotNull(backwardRoom.getDescription());
		player.setRoom(room);
		player.moveBackwards();
		assertEquals(player.getRoom().getDescription(), backwardRoom.getDescription());
	}
	
	@Test
	public void testMoveRight() {
		Player player = new Player("Newplayer");
		Room rightRoom = new RoomBuilder().setDescription("rightRoom").constructRoom();
		Room room = new RoomBuilder().setDescription("ThisRoom").setRightRoom(rightRoom).constructRoom();
		assertNotNull(room.getDescription());
		assertNotNull(rightRoom.getDescription());
		player.setRoom(room);
		player.moveRight();
		assertEquals(player.getRoom().getDescription(), rightRoom.getDescription());
	}
}

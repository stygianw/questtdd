package ua.stygianw.questtdd;

public class Player {

	private Room room;

	public void setRoom(Room room) {
		this.room = room;
	}

	public void moveForward() {
		this.room = this.room.getForwardRoom();
		
	}

	public Room getRoom() {
		return this.room;
	}

}

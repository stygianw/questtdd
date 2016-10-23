package ua.stygianw.questtdd;

public class Player {

	private Room room;
	private String name;

	public void setRoom(Room room) {
		this.room = room;
	}

	public void moveForward() {
		this.room = this.room.getForwardRoom();
		
	}

	public Room getRoom() {
		return this.room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package ua.stygianw.questtdd;

public class Room {

	private String description;
	private Room leftRoom;
	private Room rightRoom;
	private Room forwardRoom;
	private Room backwardRoom;

	private Room(RoomBuilder builder) {
		description = builder.description;
		leftRoom = builder.leftRoom;
		rightRoom = builder.rightRoom;
		forwardRoom = builder.forwardRoom;
		backwardRoom = builder.backwardRoom;
	}

	public String getDescription() {
		return this.description;
	}

	public Room getForwardRoom() {
		return this.forwardRoom;
	}
	
	public static class RoomBuilder {
		
		private Room forwardRoom;
		private Room backwardRoom;
		private Room leftRoom;
		private Room rightRoom;
		private String description;

		RoomBuilder setForwardRoom(Room room) {
			this.forwardRoom = room;
			return this;
		}
		
		RoomBuilder setBackwardRoom(Room room) {
			this.backwardRoom = room;
			return this;
		}
		
		RoomBuilder setLeftRoom(Room room) {
			this.leftRoom = room;
			return this;
		}
		
		RoomBuilder setRightRoom(Room room) {
			this.rightRoom = room;
			return this;
		}
		
		RoomBuilder setDescription(String desc) {
			this.description = desc;
			return this;
		}
		
		public Room constructRoom() {
			return new Room(this);
		}
	}
}

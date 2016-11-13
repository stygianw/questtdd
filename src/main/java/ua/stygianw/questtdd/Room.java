package ua.stygianw.questtdd;

public class Room {

	private final String description;
	private final Room leftRoom;
	private final Room rightRoom;
	private final Room forwardRoom;
	private final Room backwardRoom;
	private Item item;

	private Room(RoomBuilder builder) {
		description = builder.description;
		leftRoom = builder.leftRoom;
		rightRoom = builder.rightRoom;
		forwardRoom = builder.forwardRoom;
		backwardRoom = builder.backwardRoom;
		this.item = builder.item;
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
		private Item item;

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

		public RoomBuilder setItem(Item item) {
			this.item = item;
			return this;
		}
	}

	public Room getLeftRoom() {
		return leftRoom;
	}

	public Room getBackwardRoom() {
		return this.backwardRoom;
	}

	public Room getRightRoom() {
		return this.rightRoom;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}

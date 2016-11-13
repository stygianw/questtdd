package ua.stygianw.questtdd;

public class Player extends Being {

	private Room room;
	private Weapon weapon;
	public Player(String name) {
		super(name, 20, 100);
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void moveForward() {
		this.room = this.room.getForwardRoom();
		
	}

	public Room getRoom() {
		return this.room;
	}

	public void moveLeft() {
		this.room = this.room.getLeftRoom();
	}

	public void moveBackwards() {
		this.room = this.room.getBackwardRoom();
	}

	public void moveRight() {
		this.room = this.room.getRightRoom();
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	@Override
	public int getHitPower() {
		return this.weapon != null ? this.hitPower + this.weapon.getDamage() : this.hitPower;
	}

	public void applyRoomItem() {
		if(this.room.getItem() != null) {
			this.room.getItem().useItem(this);
		}
	}
}

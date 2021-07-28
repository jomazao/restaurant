package models;

public class Table {
	
	private String number ;
	private int capacity;
	private String location;
	
	public Table(String number, int capacity, String location) {
		this.number = number;
		this.capacity = capacity;
		this.location = location;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}

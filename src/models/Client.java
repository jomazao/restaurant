package models;

public class Client {

	/// Attributes

	private String name;
	private String lastName;
	private String nId;
	private String phoneNumber;
	private boolean hasChildren;

	/// Constructor
	public Client(String name, String lastName, String nId, String phoneNumber, boolean hasChildren) {
		this.name = name;
		this.lastName = lastName;
		this.nId = nId;
		this.phoneNumber = phoneNumber;
		this.hasChildren = hasChildren;
	}

	/// Methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getnId() {
		return nId;
	}

	public void setnId(String nId) {
		this.nId = nId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	public boolean getHasChildren() {
		return hasChildren;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", lastName=" + lastName + ", nId=" + nId + ", phoneNumber=" + phoneNumber
				+ ", hasChildren=" + hasChildren + "]";
	}
	

}

package models;

public class Recipe {
	
	/// Attributes
	private String name;
	private int price;
	
	/// Constructor
	public Recipe(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	/// Methods
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}

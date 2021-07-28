package models;

public class Product {
	
	/// Attributes
	
	private String brand;
	private String name;
	private double price;
	private int quantity; 
			
	/// Constructor
	public Product(String brand, String name, double price, int quantity){
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/// Methods/ get / set

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		
	
}

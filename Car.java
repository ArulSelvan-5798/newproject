package oops;

public class Car {
	private String brand;
	private String color;
	private int price;
	private Engine engine;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return engine;
	}

}

package oops;

public class Engine {
	private String brand;
	private int price;
	private int noOfPistons;
	
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
	public void setnoOfPistons(int noOfPistons) {
		this.noOfPistons=noOfPistons;
	}
	public int getnoOfPistons() {
		return noOfPistons;
	}

}

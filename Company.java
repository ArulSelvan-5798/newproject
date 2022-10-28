package oops;

public class Company {
	private String name;
	private String location;
	private int noOfFloors;
	private Employee employee;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setEmployee(Employee employee) {
		this.employee=employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	
	public Company(String name,String location,int noOfFloors,Employee employee) {
		this.name=name;
		this.location=location;
		this.noOfFloors=noOfFloors;
		this.employee=employee;
	}
	
	public String toString() {
		return name+" "+location+" "+noOfFloors+" "+employee;
	}
	

}

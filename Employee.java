package oops;

public class Employee {
	
	private String name;
	private int salary;
	private int id;
	private String department;

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	
	public Employee(String name,int salary,int id,String department) {
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.department=department;
	}
	public String toString() {
		return name+" "+salary+" "+id+" "+department;
	}
	
}

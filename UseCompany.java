package oops;

public class UseCompany {
	public static void main(String [] args) {
		Employee emp=new Employee("SilambarasanTR",100000,555,"Software");
		
		Company company=new Company("HCL","Chennai",20,emp);
		
		System.out.println("Emp Name:"+company.getEmployee().getName());
		System.out.println("Salary:"+company.getEmployee().getSalary());
		System.out.println("Company Name:"+company.getName());
		System.out.println("Simbu");
	}

}

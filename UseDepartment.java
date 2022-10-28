package oops;

public class UseDepartment {
	public static void main(String []args) {
		Student student=new Student();
		student.setName("SilambarasanTR");
		student.setrollNo(5);
		student.setisMale(true);
		
		Department dep=new Department();
		dep.setName("Mechanical");
		dep.setCode(115);
		dep.SetisManual(true);
		dep.setStudent(student);
		
		System.out.println("Department:"+dep.getName());
		System.out.println("Code:"+dep.getCode());
		System.out.println(dep.getisManual());
		System.out.println("Name:"+dep.getStudent().getName());
		System.out.println("RollNo:"+dep.getStudent().getrollNo());
		
		
	}

}

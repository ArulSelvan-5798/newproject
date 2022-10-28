package oops;

public class Department {
	private String name;
	private int code;
	private boolean isManual;
	private Student student;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCode(int code) {
		this.code=code;
	}
	public int getCode() {
		return code;
	}
	public void SetisManual(boolean isManual) {
		this.isManual=isManual;
	}
	public boolean getisManual() {
		return isManual;
	}
	public void setStudent(Student student) {
		this.student=student;
	}
	public Student getStudent() {
		return student;
	}

}

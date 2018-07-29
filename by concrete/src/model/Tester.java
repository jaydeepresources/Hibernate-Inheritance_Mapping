package model;

public class Tester extends Employee {

	String mode;

	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public Tester(String id, String name, float salary, String mode) {
		super(id, name, salary);
		this.mode = mode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "Tester [id=" + id + ", name=" + name + ", salary=" + salary + ", mode=" + mode + "]";
	}

}

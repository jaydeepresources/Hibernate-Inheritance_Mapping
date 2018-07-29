package model;

public class Programmer extends Employee {

	String technology;
	
	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	public Programmer(String id, String name, float salary,String technology) {
		super(id, name, salary);
		this.technology = technology;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", salary=" + salary + ", technology=" + technology  +"]";
	}
}

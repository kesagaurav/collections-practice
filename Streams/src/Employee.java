
public class Employee {
	private int id;
	private String name;
	private String designation;
	private double salrly;
	private String dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, double salrly, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salrly = salrly;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalrly() {
		return salrly;
	}

	public void setSalrly(double salrly) {
		this.salrly = salrly;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salrly=" + salrly
				+ ", dept=" + dept + "]";
	}

	

}


public class Employee {
private int id;
private String name;
private double salarly;
private String designation;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, double salarly, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.salarly = salarly;
	this.designation = designation;
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
public double getSalarly() {
	return salarly;
}
public void setSalarly(double salarly) {
	this.salarly = salarly;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salarly=" + salarly + ", designation=" + designation + "]";
}


}

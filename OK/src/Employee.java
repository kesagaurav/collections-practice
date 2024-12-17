
public class Employee {
private int eid;
private String name;
private String loc;
private double salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String name, String loc, double salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.loc = loc;
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", loc=" + loc + ", salary=" + salary + "]";
}


}

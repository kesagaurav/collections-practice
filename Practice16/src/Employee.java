
public class Employee {
private int eid;
private String nmae;
private double salary;
public Employee(int eid, String nmae, double salary) {
	super();
	this.eid = eid;
	this.nmae = nmae;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getNmae() {
	return nmae;
}
public void setNmae(String nmae) {
	this.nmae = nmae;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", nmae=" + nmae + ", salary=" + salary + "]";
}


}


public class Employee {
private int id;
private String name;
private String roolno;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String roolno) {
	super();
	this.id = id;
	this.name = name;
	this.roolno = roolno;
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
public String getRoolno() {
	return roolno;
}
public void setRoolno(String roolno) {
	this.roolno = roolno;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", roolno=" + roolno + "]";
}

}

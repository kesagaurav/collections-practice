
public class Employee {
private int id;
private String name;
private double amount;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, double amount) {
	super();
	this.id = id;
	this.name = name;
	this.amount = amount;
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
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", amount=" + amount + "]";
}

}


public class Employee {
public int id;
public String nmae;
private Double	 amount;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String nmae, Double amount) {
	super();
	this.id = id;
	this.nmae = nmae;
	this.amount = amount;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNmae() {
	return nmae;
}
public void setNmae(String nmae) {
	this.nmae = nmae;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", nmae=" + nmae + ", amount=" + amount + "]";
}



}

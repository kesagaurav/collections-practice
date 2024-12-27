
public class Product {
private int pid;
private String pname;
private Double cost;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, Double cost) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.cost = cost;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", cost=" + cost + "]";
}


}

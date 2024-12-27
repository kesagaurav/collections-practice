
public class Order {
private int orderid;
private String orderName;
private double amount;
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
public Order(int orderid, String orderName, int amount) {
	super();
	this.orderid = orderid;
	this.orderName = orderName;
	this.amount = amount;
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Order [orderid=" + orderid + ", orderName=" + orderName + ", amount=" + amount + "]";
}


}

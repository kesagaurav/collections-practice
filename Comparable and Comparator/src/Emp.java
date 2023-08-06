
public class Emp {
private int eid;
private String name;
private String state;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int eid, String name, String state) {
	super();
	this.eid = eid;
	this.name = name;
	this.state = state;
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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "emp details are [eid is " + eid + "  , " + " name is " + " , " + name + " ,"  + " state is " + state + "]";
}


}

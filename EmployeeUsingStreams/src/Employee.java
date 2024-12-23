
public class Employee {
private int eid;
private String fname;
private String lname;
private String gender;
private int age;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String fname, String lname, String gender, int age) {
	super();
	this.eid = eid;
	this.fname = fname;
	this.lname = lname;
	this.gender = gender;
	this.age = age;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age=" + age
			+ "]";
}



}

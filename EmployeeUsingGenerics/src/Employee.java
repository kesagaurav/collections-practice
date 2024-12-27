import java.util.Collection;

public class Employee {

	public int eid;
	public String name;
	private String desc;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, String desc) {
		super();
		this.eid = eid;
		this.name = name;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", desc=" + desc + "]";
	}
	
	
}

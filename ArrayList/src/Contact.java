
public class Contact {

	private String phoneNumber;
	private String name;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String phoneNumber, String name) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + "]";
	}
	
	
}

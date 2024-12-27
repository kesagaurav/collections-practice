import java.util.List;

public class Mobile {

	private String number;
	private List<Contact> contacts;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String number, List<Contact> contacts) {
		super();
		this.number = number;
		this.contacts = contacts;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public boolean addPhone(Contact contact) {
		if(contact.getName()=="gaurav") {
			System.out.println("name is already there");
			return false;
		}
		contacts.add(contact);
		return true;
	}
	
	public boolean updatePhone(Contact contact) {
		if(contact.getName()=="gaurav") {
			System.out.println("name is already there");
			return false;
		}
		contacts.set(0, contact);
		return true;
	}
	
	public int findContacts(String name) {
		for(int i=0;i<this.contacts.size();i++) {
			if(this.contacts.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "Mobile [number=" + number + ", contacts=" + contacts + "]";
	}
	
	
	
}

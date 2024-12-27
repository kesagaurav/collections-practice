
public class PersonalDetails {
private String name;
private String contactno;
private String address;
private String pincode;
private String country;
public PersonalDetails() {
	super();
}
public PersonalDetails(String name, String contactno, String address, String pincode, String country) {
	super();
	this.name = name;
	this.contactno = contactno;
	this.address = address;
	this.pincode = pincode;
	this.country = country;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "PersonalDetails [name=" + name + ", contactno=" + contactno + ", address=" + address + ", pincode="
			+ pincode + ", country=" + country + "]";
}


}

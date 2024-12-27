import java.util.ArrayList;
import java.util.List;

public class Guest {
private String name;
private String dob;
private String language;
private String country;
private String hobby;
public Guest() {
	super();
	// TODO Auto-generated constructor stub
}
public Guest(String name, String dob, String language, String country, String hobby) {
	super();
	this.name = name;
	this.dob = dob;
	this.language = language;
	this.country = country;
	this.hobby = hobby;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
@Override
public String toString() {
	return "Guest [name=" + name + ", dob=" + dob + ", language=" + language + ", country=" + country + ", hobby="
			+ hobby + "]";
}


		


}

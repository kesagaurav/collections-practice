
public class Votes {
private int vid;
private String name;
private int age;
public Votes() {
	super();
	// TODO Auto-generated constructor stub
}
public Votes(int vid, String name, int age) {
	super();
	this.vid = vid;
	this.name = name;
	this.age = age;
}

public void show() {
	System.out.println(this.vid + " " + this.name + " " + this.age);
}
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

//public abstract void gaurav();//abstarct methofs will only be abalibale in the abstcratc class only
@Override
public String toString() {
	return "Votes [vid=" + vid + ", name=" + name + ", age=" + age + "]";
}



}


	


package test2;

public abstract class Student {
int id;
String name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public abstract void printStudentName();
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public static void b() {
	System.out.println("i am in sturdnet class");
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

}

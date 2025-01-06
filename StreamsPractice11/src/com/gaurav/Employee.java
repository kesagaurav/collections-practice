package com.gaurav;

public class Employee {

	public int eid;
	public String name;
	public String city;
	public int age;
	public String active;
	public String dept;
	public int yearOfJoining;
	double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String name, String city, int age, String active, String dept, int yearOfJoining,double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.city = city;
		this.age = age;
		this.active = active;
		this.dept = dept;
		this.yearOfJoining = yearOfJoining;
		this.salary=salary;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", city=" + city + ", age=" + age + ", active=" + active
				+ ", dept=" + dept + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
}

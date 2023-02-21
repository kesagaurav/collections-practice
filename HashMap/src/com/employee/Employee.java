package com.employee;

public class Employee {

	private int id;
	private String name;
	private String desc;
	private double salarly;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String desc, double salarly) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.salarly = salarly;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getSalarly() {
		return salarly;
	}

	public void setSalarly(double salarly) {
		this.salarly = salarly;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desc=" + desc + ", salarly=" + salarly + "]";
	}

}

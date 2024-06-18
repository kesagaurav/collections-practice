package com.gaurav;
import java.util.*;
public class Employee {

	private int id;
	private String name;
	private Double salary;
	private Map<Integer,Company> map=new HashMap<>();
	HashSet<Address> set=new HashSet<>();
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Double salary, Map<Integer, Company> map, HashSet<Address> set) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.map = map;
		this.set = set;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Map<Integer, Company> getMap() {
		return map;
	}
	public void setMap(Map<Integer, Company> map) {
		this.map = map;
	}
	public HashSet<Address> getSet() {
		return set;
	}
	public void setSet(HashSet<Address> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", map=" + map + ", set=" + set + "]";
	}
	
	

	
}

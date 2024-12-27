//package com.main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.employee.Employee;

public class Main {

	public static void main(String[] args) {

		/*
		 * HashMap<Integer, Integer> map = new HashMap<>(); map.put(1, 1); map.put(2,
		 * 2); map.forEach((k, v) -> System.out.println("key = " + k + "and value is " +
		 * v)); for (Map.Entry<Integer, Integer> entry : map.entrySet()) { Integer key =
		 * entry.getKey(); Integer val = entry.getValue(); System.out.println(key + " "
		 * + val);
		 * 
		 * }
		 */
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1, "gaurav", "dse",43849.0));
		empList.add(new Employee(2, "suresh", "pp",50000.0));
		empList.add(new Employee(3, "jack", "dse",33849.0));
		empList.add(new Employee(4, "john", "pp",51000.0));
		empList.add(new Employee(4, "john", "pp",51000.0));
		empList.forEach(e->System.out.println(e));
		HashMap<String,List<String>> hmap=(HashMap<String, List<String>>) empList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getDesc, Collectors.toList())));
		System.out.println(hmap);
		HashMap<Integer,List<String>> hmap1=(HashMap<Integer, List<String>>) empList.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(hmap1);
		
		System.out.println(hmap + " " + hmap1);
		for (Map.Entry<String, List<String>> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + "value is " + entry.getValue());
			String key = entry.getKey();
			List<String> val = entry.getValue();
			
		}
		
		for(Map.Entry<Integer, List<String>> entry:hmap1.entrySet()){
			List<String> value=entry.getValue();
			int key=entry.getKey();
			System.out.println("key is " + key +  " and value is " + value.toString());
			
		}
		
		Map<String,Double> doubles = empList.stream().filter(a->a.getDesc().contains("dse")).collect(Collectors.groupingBy(Employee::getDesc,Collectors.averagingDouble(a->a.getSalarly())));
		System.out.println("avg value of dse is " + doubles);
		double d=empList.stream().filter(a->a.getDesc().contains("pp")).collect(Collectors.averagingDouble(a->a.getSalarly()));
		System.out.println("avg value  of pp value is " + d);
		Double d1=empList.stream().collect(Collectors.averagingDouble(a->a.getSalarly()));
		System.out.println("values of all salaries " + d1);
		Set<Employee> set=new HashSet<>();
		Map<Double, Set<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getSalarly,Collectors.toSet()));
		System.out.println(collect.toString());
		Map<String,List<Employee>> emap=empList.stream().collect(Collectors.groupingBy(a->a.getName(),Collectors.toList()));
		System.out.println(emap);
		for(Map.Entry<String, List<Employee>> emp:emap.entrySet()) {
			System.out.println(emp.getKey() + " " + emp.getValue());
		}
		Set<Employee> collect2 = empList.stream().collect(Collectors.toSet());
		
		System.out.println(collect2);
		empList.stream().distinct().forEach(e->System.out.println(e));
		long count=empList.stream().filter(a->{
			int id = empList.get(0).getId();
			if(a.getId()==id) {
				return true;
			}else {
				return false;
			}
		}).count();
		System.out.println(" values are " + count);
		
		int id2=empList.get(4).getId();
		String name=empList.get(4).getName();
		System.out.println(id2 + "  " + name);
	}

}

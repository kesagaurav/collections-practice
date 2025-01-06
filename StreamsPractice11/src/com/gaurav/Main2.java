package com.gaurav;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = Arrays.asList(new Employee(1, "gaurav", "ban",27,"yes","IT",2022,44000.0), new Employee(2, "gaurav1", "war",26,"no","HR",2025,100.0),
				new Employee(3, "deepa", "hyd",30,"no","Businisess",2023,5000.00), new Employee(4, "jack", "usa",43,"yes","Medical",2022,4500.00), new Employee(5, "soros", "eu",26,"no","IT",2025,1000.0),new Employee(6, "abc", "eu2",20,"yes","HR",2029,1000.0));

		TreeMap<String, List<String>> collect = list.stream().collect(Collectors.groupingBy(a->a.getCity(), TreeMap::new, Collectors.mapping(a->a.getName(), Collectors.toList())));
		collect.forEach((name,city)->{
			System.out.println("\n the value is " + name + " city is " + city);
		});
		
		double max1=list.stream().mapToDouble(r->r.getSalary()).boxed().max(Comparator.comparing(a->a)).get();
		System.out.println("\n max1 val is " + max1);
		
		
		double min2=list.stream().mapToDouble(r->r.getSalary()).boxed().min(Comparator.comparing(a->a)).get();
		System.out.println("\n min1 val is " + min2);
		
		
		
		//sort the employess by names
//		Collections.sort(list, (Employee e1,Employee e2)->{
//			e1=e1.getName();
//			e2=e2.getName();
//			return e1==e2;
//		});
		
		list.sort(Comparator.comparing(Employee::getName));
		System.out.print(list);
		
		System.out.println("\n reversing the list");
		list.sort(Comparator.comparing(Employee::getName).reversed());
		System.out.print(list);
		
		
		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getName).thenComparing(Employee::getCity);
		list.sort(thenComparing);
		System.out.println("\n using comparator");
		list.forEach(e->System.out.println(e.getName() + " - " +  e.getCity()));
		
		
		list.stream().filter(a->a.getEid()>1).collect(Collectors.toList()).forEach(e->System.out.print(e + " "));
		
		//program to print max and min sal of employee
		Employee d=list.stream().collect(Collectors.maxBy(Comparator.comparing(a->a.getSalary()))).get();
		System.out.println("\n max sal is " + d);
	
		//min sal is.
		Employee min=list.stream().collect(Collectors.minBy(Comparator.comparing(a->a.getSalary()))).get();
		System.out.println("\n min sal is " + min);
	
	
	
	
		Map<String, Optional<Employee>> d2=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		d2.forEach((dept,salary)->{
			System.out.println("dept is " + dept + " salary is  " + salary);
		});
	
	
	Map<String,Long> map7=	list.stream().collect(Collectors.groupingBy(a->a.getActive(),Collectors.counting()));
	
	System.out.println("\n actuve and incaltive us " + map7);
	
	//employee detaisl working in same dept
	Map<String, List<Employee>> collect2 = list.stream().collect(Collectors.groupingBy(a->a.getDept(),Collectors.toList()));
	
	collect2.forEach((key,value)->{
		System.out.println("key is ---> " + key + " val is --> " + value);
	});
	
	
	//employee count in each department.
	Map<String, Long> collect3 = list.stream().collect(Collectors.groupingBy(a->a.getDept(),Collectors.counting()));
	collect3.forEach((key,val)->{
		System.out.println("key is ---> " + key + " val is --> " + val);

	});
	
	
	
	
	}

}

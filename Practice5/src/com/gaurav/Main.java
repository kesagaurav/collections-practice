package com.gaurav;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Company c=new Company(1, "infosys");
		Company c1=new Company(2, "wipro");
		Company c2=new Company(3, "IBM");
		Company c3=new Company(4, "TCS");
		Company c4=new Company(5, "Mphasis");

		HashMap<Integer,Company> map=new HashMap<>();
		map.put(1, c);
		map.put(2, c1);
		map.put(3, c2);
		map.put(4, c3);
		map.put(5, c4);
		System.out.println(map);
		
		HashSet<Address> adList=new HashSet<>();
		adList.add(new Address("tel", 506002, "india"));
		adList.add(new Address("kerela", 506003, "ban"));
		adList.add(new Address("mp", 506004, "india"));
		adList.add(new Address("maha", 506002, "nepal"));
		adList.add(new Address("ok", 506002, "india"));
		
		System.out.println(adList);
		
		List<Employee> eList=new ArrayList<>();
		eList.add(new Employee(1, "gauarv", 1000000.00, map, adList));
		eList.add(new Employee(2, "deepa", 2000000.00, map, adList));
		eList.add(new Employee(3, "omkar", 1000000.00, map, adList));
		eList.add(new Employee(4, "yash", 3000000.00, map, adList));
		eList.add(new Employee(5, "keerhi", 4000000.00, map, adList));
		eList.stream().forEach(e->System.out.println(e));
		System.out.println("based on gaurav salary");
		eList.stream().filter(a->a.getName().equals("gauarv")).map(a->a.getSalary()).forEach(e->System.out.println(e));



	}

}

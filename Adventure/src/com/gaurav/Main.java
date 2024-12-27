package com.gaurav;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Integer, Location> locations = new HashMap<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		locations.put(0, new Location(0, "u are sitting in front of ur computer for learning java"));
		locations.put(1, new Location(1, "u are standing at top of hils"));
		locations.put(2, new Location(2, "u are set at top of hils"));
		locations.put(3, new Location(3, "u are inside of cofffe"));
		locations.put(4, new Location(4, "u are in a valley beside stream"));
		locations.put(5, new Location(5, "u are in the forest"));
		for (Map.Entry<Integer, Location> entry : locations.entrySet()) {
			Integer key = entry.getKey();
			Location val = entry.getValue();
			System.out.println(key.toString() + " " + val.toString());
		}
		locations.get(1).addExit("W", 2);
		locations.get(1).addExit("E", 3);
		locations.get(1).addExit("S", 4);
		locations.get(1).addExit("N", 5);

		locations.get(2).addExit("N", 5);

		locations.get(3).addExit("W", 1);

		locations.get(4).addExit("W", 2);
		locations.get(4).addExit("N", 1);

		locations.get(5).addExit("S", 1);
		locations.get(5).addExit("W", 2);
		
		Map<String,String> voc=new HashMap<>();
		voc.put("North", "N");
		voc.put("South", "S");
		voc.put("East", "E");
		voc.put("West", "W");
		voc.put("Quit", "Q");
		

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			if (loc == 0) {
				break;
			}
			Map<String, Integer> exists = locations.get(loc).getExists();
			System.out.println("Available exists are");
			for (String exit : exists.keySet()) {
				System.out.println(exit + " ");
			}
			System.out.println();
			String direction = sc.nextLine().toUpperCase();
			if(direction.length()>1) {
				String[] split=direction.split("");
				for(String splits:split) {
					if(voc.containsKey(split)) {
						direction=voc.get(split);
						break;
					}
				}
			}
			if (exists.containsKey(direction)) {
				loc = exists.get(direction);
			} else {
				System.out.println("u cannot go to that direction");
			}
			// nloc=sc.nextInt();
			if (!locations.containsKey(loc)) {
				System.out.println("u cannot go any where");
			}
		}

	}

}

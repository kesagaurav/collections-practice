import java.util.*;

public class Gaurav {

	static HashMap<String, Integer> hmap = new HashMap<>();
	private int a = 10;
	static List<Integer> list = new ArrayList<>();
	static Set<Integer> set=new HashSet<>();
	{
		System.out.println("gaurav i am in instance block");
	}

	public Gaurav(int a) {
		super();
		this.a = a;
		System.out.println("i am in contructore of gaurav");

	}

//	static void callGaurav() {
//		System.out.println("i am in callGaurav methid " + hmap);
//	}

	static {

		hmap.put("gaurav", 1);

		hmap.put("deepa", 2);
		hmap.put("omkar", 3);
		System.out.println("i am in static block " + hmap);

	}

	static {

		list.add(1);
		list.add(10);
		list.add(11);
		System.out.println("i am in second static block " + list);

	}
	
	
	
	static {

		set.add(1);
		set.add(11);
		set.add(11);
		System.out.println("i am in third static block " + set);

	}
}

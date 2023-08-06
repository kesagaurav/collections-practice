import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> al = new ArrayList<>();
		al.add(new Emp(1, "gaurav", "Tel"));
		al.add(new Emp(2, "gaurav1", "Maharastra"));
		al.add(new Emp(3, "gaurav2", "karnataka"));
		al.add(new Emp(4, "gaurav3", "Tel"));
		al.add(new Emp(5, "gaurav4", "Tel"));
		al.add(new Emp(6, "gaurav5", "Maharastra"));

		al.forEach(e -> System.out.println(e));
		Collections.sort(al, (Emp a1, Emp a2) -> {
			String b1 = a1.getName();
			String b2 = a2.getName();
			return b1.compareTo(b2);
		});
		System.out.println("names based on sort " + al);
		EmpList(al);
		long count = al.stream().filter(a -> a.getName().equals("gaurav")).map(a -> a.getState()).count();
		System.out.println(count);
		al.stream().filter(a -> !a.getState().equals("Tel")).forEach(e -> System.out.println(e));
		al.stream().filter(a -> a.getState().equals("Maharastra"))
				.forEach(e -> System.out.println("the details of maharastra are " + e));
		al.stream().filter(a -> a.getEid() > 3).map(a -> a.getEid() + " " + a.getName())
				.forEach(e -> System.out.println(e));
		StringBuilder sb = new StringBuilder("gaurav");
		sb.append(" kesa ").append("roll no is ").append(531).append(" sai kiran roll no is ").append(505);
		System.out.println(sb);
		String s = "gaurav how are u";
		StringBuilder sb1 = new StringBuilder(s);
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(sb1.append(Character.toUpperCase(s.charAt(i))).append(s.substring(i)).toString().trim());
//		}

	}
	
	
	public static void EmpList(List<Emp> emp) {
		for(Emp e:emp) {
			System.out.println(e);
		}
	}

}

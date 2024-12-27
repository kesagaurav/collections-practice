import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.hi();
		A a=new B();
		a.hi();
		a.hello();
		A a1=new A();
		a1.hi();
		
		// one null key and can have multiple null values
		Map<Integer,Integer> ok=new HashMap<>();
		ok.put(null, 1);
		ok.put(null, 2);// if the key is duplicate it will replace the new value
		ok.put(null, 3);
		ok.put(null, 4);
		ok.put(1, 2);
		ok.put(4, 3);
		ok.put(5, null);
		ok.put(6,null);
		ok.put(7, null);

		System.out.println(ok);
		
		Map<Integer,Integer> tm=new TreeMap<>();
		tm.put(1, 1);
		//tm.put(null, 2);// in tree map u cannot have null keys and can have multiple null values
		tm.put(1, 0);
		tm.put(2, null);
		tm.put(4, 5);
		System.out.println(tm);

		String s1="gaurav";
		String s2="gaurav";
		String s3=new String("gaurav");
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
	}

	
	

}

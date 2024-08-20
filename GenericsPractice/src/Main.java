import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<String> test = new Test<>(1, "gaurav");
		Test<String> test1 = new Test<>(2, "gaurav1");
		Test<String> test2 = new Test<>(3, "gaurav2");
		Test<String> test3 = new Test<>(4, "gaurav3");
		Test<String> test4 = new Test<>(5, "gaurav4");

		test.getId();
		test.getNmae();
		System.out.println(test);
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);

		Test2<String, Integer> testMap = new Test2<String, Integer>("gaurav", 1);
		Test2<String, Integer> testMap1 = new Test2<String, Integer>("gaurav1", 2);
		Test2<String, Integer> testMap2 = new Test2<String, Integer>("gaurav2", 3);
		Test2<String, Integer> testMap3 = new Test2<String, Integer>("gaurav3", 4);
		Test2<String, Integer> testMap4 = new Test2<String, Integer>("gaurav4", 5);

		System.out.println(testMap);
		System.out.println(testMap2);
		System.out.println(testMap3);
		System.out.println(testMap4);
		System.out.println(testMap1);

		GenericClass<String> g = new GenericClass<String>("gaurav");
		System.out.println(g.getValue());
		System.out.println("int values using generics");
		GenericClass<Integer> g1 = new GenericClass<Integer>(19);
		System.out.println(g1.getValue());
		System.out.println("float values using generics");

		GenericClass<Float> gFloat = new GenericClass<Float>(19F);
		System.out.println(gFloat.getValue());
		System.out.println("double values using generics");

		GenericClass<Double> gDouble = new GenericClass<Double>(19.0);
		System.out.println(gDouble.getValue());
		System.out.println("char values using generics");

		GenericClass<Character> gChar=new GenericClass<Character>('G');
		System.out.println(gChar.getValue());
		
		System.out.println("boolean values using generics");

		GenericClass<Boolean> gBool=new GenericClass<Boolean>(true);
		System.out.println(gBool.getValue());
		
		List<Double> list=Arrays.asList(1.0,2.2,3.3);
		add(list);

	}
	
	static void add(List<? extends Number> list) {
		double d=0;
		for(Number d1:list) {
			d+=d1.doubleValue();
			
		}
	}

}



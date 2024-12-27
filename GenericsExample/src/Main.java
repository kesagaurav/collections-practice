import java.util.*;
import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaurav<String> g = new Gaurav<>("gaurav");
		g.print();
		Gaurav<Integer> g1 = new Gaurav<>(10);
		g1.print();
		Gaurav<Character> g2 = new Gaurav<>('A');
		g2.print();

		Gaurav1<Double> g3 = new Gaurav1(20.1);
		g3.print();

		List<Double> d = Arrays.asList(1.0, 2.0, 3.0);
		add(d);
		List<Object> ob = new ArrayList<>();
		printLower(ob);

		BiPredicate<Integer, Double> d1 = (a, e) -> {
			if (a > e) {
				return true;
			}else {
			return false;
			}
		};
		System.out.println(d1.test(19, 11.0));

	}

	public static void add(List<? extends Number> list) {
		double sum = 0;
		for (Number i : list) {
			sum += i.doubleValue();
		}
	}

	public static void printLower(List<? super Integer> list) {
		System.out.println(list);
	}

}

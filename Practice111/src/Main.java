import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(5);
//		list.add(6);
		Optional<Integer> collect = list.stream().collect(Collectors.maxBy((a, b) -> a > b ? a : b));
		System.out.println(list.size() - 2);

		// 3,495,59,533,323,23,9,0,55,123,7763
		list.add(3);
		list.add(495);
		list.add(59);
		list.add(533);
		list.add(323);
		list.add(23);
		list.add(9);
		list.add(0);
		list.add(55);
		list.add(123);
		list.add(7763);
		System.out.println(list);
		int max = 0;
		int secMax = 0;
		for (int i = 0; i < list.size(); i++) {
			max = Integer.MAX_VALUE;
			if ( max>list.get(i)) {
				max = list.get(i);
			}

			
			//secMax = max;
			if (secMax > max ) {
				System.out.println("value is " + secMax);
			}
		}
		System.out.println("max value is " + max);
		System.out.println("sec max is " + secMax);

	}

}

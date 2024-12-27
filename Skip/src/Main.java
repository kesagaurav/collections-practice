import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,9,8,7,3,5,6,7,1);
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(7);
	}

}

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<List<Integer>> {

	@Override
	public List<Integer> get() {
		List<Integer> ga=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		return ga;
	}

}


class SupplierDemo1 implements Supplier<List<String>> {

	@Override
	public List<String> get() {
		List<String> ga=Arrays.asList("g","a","u");
		return ga;
	}

}

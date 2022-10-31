import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<List<Integer>>  {


@Override
public boolean test(List<Integer> t) {
	t=Arrays.asList(1,2,3,4,5);
	if(t.get(0)%2==0) {
		return true;
	}
	return false;
}
}

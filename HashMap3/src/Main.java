import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<>();
		list.add(new Product(1, "laptop", 39999.00));
		list.add(new Product(2, "watch", 19999.00));
		list.add(new Product(3, "fridge", 49999.00));
		list.add(new Product(4, "Tv", 39999.00));
		list.stream().forEach(e->System.out.println(e));
		Map<String,Double> hmap=list.stream().collect(Collectors.toMap(a->a.getPname(), a->a.getCost()));
		System.out.println(hmap);
		Double collect = list.stream().collect(Collectors.averagingDouble(a->a.getCost()));
		System.out.println(collect);
		Map<Integer,String> hmp1=list.stream().collect(Collectors.toMap(a->a.getPid(), a->a.getPname()));
		System.out.println(hmp1);
		boolean anyMatch = list.stream().anyMatch(a->a.getPname().equals("laptop"));
		System.out.println(anyMatch);
		List<List<Product>> list2;
		//list2.stream().map(a->a.get(0).getPname()).map(Arrays::asList).map(Product::getCost).mapToDouble(Double::doubleValue).sum();
		Object[] array = list.stream().toArray();
		
		
	}

}

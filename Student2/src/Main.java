import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(1, "gaurav", "31", 'A'));
		stuList.add(new Student(2, "SAI", "32", 'B'));
		stuList.add(new Student(3, "kiran", "32", 'A'));
		stuList.add(new Student(4, "john", "34", 'C'));
		stuList.add(new Student(5, "urschow", "35", 'A'));
		
		stuList.forEach(a->System.out.println(a));
		
		System.out.println(stuList.stream().anyMatch(a->a.getName().contains("gaurav")));
		Double a=stuList.stream().collect(Collectors.averagingDouble(b->b.getId()));
		System.out.println(a);
		Map<String,List<Character>> ap=stuList.stream().collect(Collectors.groupingBy(b->b.getName(),Collectors.mapping(c->c.getSection(), Collectors.toList())));
		System.out.println(ap);
		Map<String,Long> collect = stuList.stream().collect(Collectors.groupingBy(d->d.getRollno(),Collectors.mapping(e->e.getId(), Collectors.counting())));
		System.out.println(collect);
		Map<String,String> toMap=stuList.stream().collect(Collectors.toMap(p->p.getName(),g->g.getRollno()));
		System.out.println(toMap);
		Map<Object, Integer> toMap1=stuList.stream().collect(Collectors.toMap(d->d.getName(), Student::getId));
		System.out.println(toMap1);
		stuList.stream().map(o->o.getName()).forEach(e->System.out.println(e));

	}

}

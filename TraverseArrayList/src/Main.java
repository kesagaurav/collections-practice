import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list=new ArrayList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		System.out.println("traversing thorugh arraylist using iterator");
		ListIterator<Character> list2=list.listIterator();
		while(list2.hasNext()) {
			System.out.println(list2.next());
		}
		System.out.println("traversing thorugh arraylist using revrese iterator");

		while(list2.hasPrevious()) {
			System.out.println(list2.previous());
		}
		HashSet<Character> set=new  HashSet<>();
		set.add('a');
		set.add('b');
		set.add('c');
		set.add('a');
		for(Character set1:set) {
			if(!set.add(set1)) {
				System.out.println("duplicate found " + set1);
			}
		}
		System.out.println("duplicates are " + set);



	}

}

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(10,18,29,88,12,13);
		list.stream().map(i->i.valueOf(i)).map(a->a.toString().startsWith("1")).forEach(e->System.out.println(e));
	}
	
	
public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
	
	for(int i=0;i<nums.size();i++) {
		if(Integer.bitCount(i)==k) {
			sum+=nums.get(i);
		}
	}
	return sum;
    }



}

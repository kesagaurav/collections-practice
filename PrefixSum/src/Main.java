import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] a= {"l|*e*et|c**o|*de|"};
		String[] split=a.toString().split(" ");
		System.out.println(Arrays.toString(split).toCharArray());
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}

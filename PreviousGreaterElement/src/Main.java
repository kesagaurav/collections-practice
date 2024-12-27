import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 10, 30, 5, 15 };
		Stack<Integer> st = new Stack<>();
		st.push(arr[0]);
		int a = 0;
		for (int i = 1; i < arr.length; i++) {
			while (st.isEmpty() == false && st.peek() <= arr[i]) {
				st.pop();
			}
			a = st.isEmpty() ? -1 : st.peek();
			st.push(arr[i]);
		}
		System.out.println(a);
		int arr1[] = { 5, 15, 10, 8, 6, 12, 9, 18 };
		System.out.println(nextGet(arr1));

		

	}
	// nexr greater element
	public static ArrayList<Integer> nextGet(int arr[]){
		ArrayList<Integer> al=new ArrayList<>();
		
				
				Stack<Integer> st1 = new Stack<>();
				st1.push(arr[arr.length-1]);
				int a1 = 0;
				for (int i = arr.length-2; i >=0; i--) {
					while (st1.isEmpty() == false && st1.peek() <= arr[i]) {
						st1.pop();
					}
					a1 = st1.isEmpty() ? -1 : st1.peek();
					al.add(a1);
					st1.push(arr[i]);
				}
				return al;
	}

}

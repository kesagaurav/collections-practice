import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st.peek());
		System.out.println(st.get(0));
		System.out.println(st);
		int a[]= {3,4,2};
		int n=a.length;
		System.out.println(peakElement(a, n));
	

	}
	
	
	public static int peakElement(int[] arr,int n)
    {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty()) {
				st.push(arr[i]);
			}
			if(arr[i]<=st.peek()) {
				return st.peek();
			}
		}
		return -1;
    }
}



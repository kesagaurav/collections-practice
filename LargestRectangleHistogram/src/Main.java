import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,5,6,2,3,1};
		System.out.println(printRecHistogram(a));
	}

	public static int printRecHistogram(int a[]) {
		int left[], right[];
		int n = a.length;
		left = new int[n];
		right = new int[n];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (st.isEmpty() == false && a[st.peek()] >= a[i]) {
				st.pop();
			}
			if (st.isEmpty())
				left[i] = 0;
			else
				left[i] = st.peek() + 1;

			st.push(i);
		}
		while(!st.isEmpty()) {
			st.clear();
		}
		//right
		for (int i = n-1; i >= 0; i--) {
			while (st.isEmpty() == false && a[st.peek()] >= a[i]) {
				st.pop();
			}
			if (st.isEmpty())
				right[i] = n-1;
			else
				right[i] = st.peek() - 1;

			st.push(i);
		}
		
		int max=0,m=0;
		for(int i=0;i<n;i++) {
		 max=Math.max(max, a[i]*(left[i]-right[i]+1));
		}
		return max;
		

	}
}

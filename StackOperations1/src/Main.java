import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		insert(st, 1);
		insert(st, 2);
		remove(st);
		headOf_Stack(st);
		find(st, 1);
		String s="aaaaaabaabccccccc";
		System.out.println(removeDupilicates(s));


	}

	//Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
    	System.out.println(st.push(x));
    }
    
    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        // Your code here
    	System.out.println(st.pop());
    }
    
    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        // Your code here
    	System.out.println(st.peek());
    }
    
    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        // Your code here
    	if(st.search(st.peek())==val) {
    		return true;
    	}
    	return false;
    }
    
    public static String removeDupilicates(String s) {
    	//Stack<String> s1=new Stack<>();
    	HashSet<Character> s2=new HashSet<>();
    	for(int i=0;i<s.length()-1;i++) {
    		s2.add(s.charAt(i));
    	}
    	return s2.toString();
    } 
}


public class Stack {

	private int capacity;
	private int[] arr;
	private int top;

	public Stack(int capacity) {
		super();
		this.capacity = capacity;
		top=-1;
		arr=new int[capacity];
	}
	
	public void push(int x) {
		top++;
		arr[top]=x;
	}
	
	public int pop() {
		int y=arr[top];
		top--;
		return y;
	}
	
	private int size() {
		return top+1;
	}
	
	public int peek() {
		return arr[top];
	}
}

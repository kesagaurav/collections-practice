import java.util.ArrayDeque;
import java.util.ArrayList;

public class Deque {

	int size,cap;
	int a[];
	ArrayDeque<Integer> no=new ArrayDeque<>();
	public Deque(int cap) {
		cap = cap;
		size=0;
		a=new int[cap];
		
	}
	
	public void insertFront(int x) {
		for(int i=size-1;i>=0;i--) {
			a[i+1]=a[i];
			a[0]=x;
			size++;
		}
	}
	
	public void insertRear() {
		no.addLast(2);
		System.out.println(no);
	}
	
	
}



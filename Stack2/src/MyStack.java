import java.util.*;
public class MyStack {
ArrayList<Integer> al=new ArrayList<>();

public void push(int x) {
	al.add(x);
}
public int pop() {
	return al.remove(al.size()-1);
}
public boolean isEmpty() {
	return al.isEmpty();
}
public int size() {
	return al.size();
}
public int peek() {
	return al.get(0);
}
}

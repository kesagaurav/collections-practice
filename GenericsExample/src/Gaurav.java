
public class Gaurav <T> {
	
	T a;

	public Gaurav(T a) {
		super();
		this.a = a;
	}
	
	public void print() {
		System.out.println(a);
	}

	
}

class Gaurav1<Gaurav>{
	Gaurav g;

	public Gaurav1(Gaurav g) {
		super();
		this.g = g;
	}
	
	public void print() {
		System.out.println(g);
	}
}

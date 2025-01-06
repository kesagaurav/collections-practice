
public class B extends A {

	public int bid;
	public String name;
	public B(int bid, String name) {
		super();
		this.bid = bid;
		this.name = name;
		System.out.println("\n i am in B constructor paramters");
	}
	
	
	public B() {
		super();
		System.out.println("\n i am in B calss constructor");
	}
	
	
	
	
	
	public static void hello() {
		System.out.println("\n i am in b class hello method");
	}


	public B(int id, String name, double rating) {
		super(id, name, rating);
		// TODO Auto-generated constructor stub
		System.out.println("\n i am in B calss constructor with parameters");
	}


	
	
	
	
	
	
	
}

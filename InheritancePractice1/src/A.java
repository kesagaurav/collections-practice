
public  class A {

	public int id;
	public String name;
	public double rating;
	public A() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("\n i am in A class constrructor");
	}
	public A(int id, String name, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		System.out.println("\n i am in A class contructor pramaters");
	}
//	
//	public static int hello(int a) {
//		System.out.println("\n i am in A class int hello method");
//		return 0;
//	}
	
	
	
	public static void hello() {
		System.out.println("\n i am in A class int hello method");
		return;
	}
	
	
	
}

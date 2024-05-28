public class Gaurav {

	static int x;
	static {
		System.out.println("staic block inside");
		x=100;
		System.out.println("\n x="+x);
		System.out.println("static block is terminating");
	}
	public void show() {
		System.out.println("\n show()");
		System.out.println("x= " + x);
	}
}

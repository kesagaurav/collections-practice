
public class Guarav {
	static int a=10;
	static String name;
	static void display() {
		System.out.println("i am in static method display");
	}
	public Guarav() {
		System.out.println("hi i am in constructor");
	}
	static {
		name="gaurav";
		System.out.println("i am in static block " + name);
	}
	public static void main(String[] args) {
		
		System.out.println("hello i am gaurav");
		System.out.println(a);
		display();
		Guarav g=new Guarav();
		Guarav g1=new Guarav();
		Guarav g2=new Guarav();
		Guarav g3=new Guarav();
		Guarav g4=new Guarav();

		
	}
}

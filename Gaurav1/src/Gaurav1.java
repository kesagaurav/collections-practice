
public class Gaurav1 extends Gaurav implements A, B {
	public int c = 30;
	public int d = 50;

	@Override
	public void b() {

		System.out.println("\n i am b method in gaurav1 class");
	}

	@Override
	public void gaurav1() {

		System.out.println("\n i am in gaurav1 method of gaurav1 class");
	}

	@Override
	public void a1() {
		System.out.println("\n i am in al method of al class");
	}

	@Override
	public void gaurav() {
		System.out.println("\n i am in gaurav method of gaurav1 class");
	}

}

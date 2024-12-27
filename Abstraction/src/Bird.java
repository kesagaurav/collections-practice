
public abstract class Bird extends Animal implements CanFly {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(super.getName() + " is eating");
		
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("breathe in breathe out,repeat");

	}
	//using absracttion
	//public abstract void fly();
	//using interface
	@Override
	public void fly() {
		System.out.println(getName() + " is flying");
	}
}

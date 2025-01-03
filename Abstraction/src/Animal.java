
public abstract class Animal {

	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void eat();
	public abstract void breathe();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

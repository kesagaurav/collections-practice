
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("puppy");
		d.breathe();
		d.eat();
		
		Parrot parrot=new Parrot("eagle");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		Penguin p=new Penguin("emperor");
		p.fly();
		
	}

}

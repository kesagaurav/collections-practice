
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHash hash=new MyHash(5);
		hash.insert(1);
		hash.insert(2);
		System.out.println(hash.search(1));
		hash.delete(1);

	}

}

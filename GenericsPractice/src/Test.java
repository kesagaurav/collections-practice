
public class Test<T> {

	private int id;
	private String nmae;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(int id, String nmae) {
		super();
		this.id = id;
		this.nmae = nmae;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", nmae=" + nmae + "]";
	}

}

class GenericClass<G> {
	private G value;


	public G getValue() {
		return value;
	}

	public void setValue(G value) {
		this.value = value;
	}

	public GenericClass(G value) {
		this.value = value;
	}
}

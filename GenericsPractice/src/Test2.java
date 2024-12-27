
public class Test2<T,U> {

	T obj1;
	U obj2;
	public Test2(T obj1, U obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public Test2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T getObj1() {
		return obj1;
	}
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	public U getObj2() {
		return obj2;
	}
	public void setObj2(U obj2) {
		this.obj2 = obj2;
	}
	@Override
	public String toString() {
		return "Test2 [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}
	
	
	
	
}

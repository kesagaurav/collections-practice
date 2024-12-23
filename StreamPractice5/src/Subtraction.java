@FunctionalInterface
 interface Subtraction {

	int sub(int a,int b);
	//void hello();
	static void iamStatic() {
		System.out.println("static is used in interface default");
	}
		
	default void isDefault() {
		System.out.println("i am in dfault method");
	}
	
}

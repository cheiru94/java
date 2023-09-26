package theory;

class A2 {
	void prtSomething() {
		System.out.println("A");
	}
}

class B2 extends A2 {
	void prtSomething() {
		System.out.println("B");
	}
}

public class test_Inheritance_2_1 {

	public static void main(String[] args) {
		
		A2 obj = new B2();
		obj.prtSomething();

	}

}

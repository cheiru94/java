package theory;

class A5 {
	int x = 2;

	void prtX() {
		System.out.println("A5의 x:" + x);
	}
}

class B5 extends A5 {
	int x = 4;
}

class C5 extends B5 {
	void prtX() {
		System.out.println("C5의 x:" + x);
	}
}

public class Inheritence_Of_DynamicBinding {
	public static void main(String[] args) {
		A5 objB = new B5();
		A5 objC = new C5();

		objB.prtX();
		objC.prtX();

	}

}

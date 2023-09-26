package theory;

class Bar {
	int x = 3;
	Foo f1;

	void bf1(int argA) {
		f1 = new Foo(argA);
	}

}

class Foo {
	int y;

	Foo(int argA) {
		ff1();
		y = argA;
	}

	void ff1() {
		System.out.println(y);
	}
}

public class stack_heap {

	public static void main(String[] args) {

		(new Bar()).bf1(2);

	}

}

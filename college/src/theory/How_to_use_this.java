package theory;
class Bae {
	
	Bae() { // 이렇게 써도 된다. 물론 
		System.out.println("k"); // 중복
	}

	Bae(int argA) {
		this();
		int a = argA;
	}
	Bae(int argA, int argB) {
		this();
		int a = argA;
		int b = argB;
	}
}

public class How_to_use_this {

	public static void main(String[] args) {
		
		Bae b1 = new Bae(4);
		System.out.println(b1);
		
	}

}

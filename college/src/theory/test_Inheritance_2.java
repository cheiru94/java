package theory;

class A1 {
	int x = 3;
	
	void prtX() {
		System.out.println(x);
	}
}

class B1 extends A1 {
	int x = 4;
	int y = 5;
}

public class test_Inheritance_2 {

	public static void main(String[] args) {
		
		A1 obj = new B1();
		System.out.println(obj.x);
		System.out.println(((B1)obj).y);  
		
	}
}

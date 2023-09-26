package theory;

class A_2 {
	void prtX() {System.out.println("A");}
}

class B_2 extends A_2 {
	
}

class C_2 extends B_2 {
	void prtX() {System.out.println("C");}
}

public class test_polymorphism_2_2 {
	public static void main(String args[]) {
		A_2 obj = new C_2();
		
		obj.prtX();  // C
	}
}
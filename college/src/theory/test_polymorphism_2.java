package theory;

class A_1 {
	int x = 2;
	void prtX() {System.out.println("A");}
}
	
class B_1 extends A_1 {
	int x = 4;
}

class C_1 extends B_1 {
	void prtX() {System.out.println(x);}
}


public class test_polymorphism_2 {

	public static void main(String[] args) {
		A_1 obj = new C_1();
		
		obj.prtX();
		

	}

}

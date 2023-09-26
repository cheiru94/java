package theory;

class Lulu{
	int x = 3;
	void p1() {
		int y =3 ;
		p2(y);
	}
	
	void p2(int argA) {
		int z =4 ;
		p3(argA, z);
	}
	void p3 (int argB , int argC) {
		System.out.println(argB + argC);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		
			(new Lulu()).p1();

	}

}

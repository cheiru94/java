package theory;

class Soo {
	static int x =3 ;
	
	static {
		System.out.println("스태틱 초기화 블록 호출");
	}	

	{
		System.out.println("인스턴스 초기화 블록 호출");
	}

	Soo() {
		System.out.println("생성자 호출");
	}
}

public class test_initialization {

	public static void main(String[] args) {
		
		new Soo();
		
		System.out.println();

	}

}

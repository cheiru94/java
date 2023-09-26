package theory;
class Bar_1 {

	static int x =3 ;

	static {
		System.out.println("스태틱 초기화 블록 호출");
	}	

	{
		System.out.println("인스턴스 초기화 블록 호출");
	}

	Bar_1() {
		System.out.println("생성자 호출");
	}


}

public class test_initialization_basic {
	public static void main(String[] args) {
		Bar_1 betty = new Bar_1();
		System.out.println(betty);
	}
}

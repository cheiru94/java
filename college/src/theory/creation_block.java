package theory;

public class creation_block {

	public static void main(String[] args) {
		System.out.println(Bara.b);
//		Bara b1 = new Bara();
	}

}

class Bara {
    int a = 3;
    static int b = 3;

    // static 블록
    // 클래스가 처음으로 사용될 때 실행되는 블록
    // 주로 클래스 변수를 초기화 시키는 코드를 둔다.
    static {
        System.out.println("static");
//        System.out.println(a);
        System.out.println(b);
    }


    // 초기화 블록
    // 주로 인스턴스 변수를 초기화시키는 코드를 둔다.
    // 생성자가 호출 되기 전에 실행된다.
    // 인자값을 받지 않는다.
    {
        System.out.println("initialization block");
        System.out.println(a);
        System.out.println(b);
    }


    // 생성자 블록
    // new 연산자를 사용하여 인스턴스가 만들어 질때 실행되는 블록
    Bara() {
        System.out.println("const");
        System.out.println(a);
        System.out.println(b);
    }
}
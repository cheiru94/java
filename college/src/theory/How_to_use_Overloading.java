package theory;

// Overloading
// -> 구조적언어 부터 시작 된 개념
// -> 적용 대상 : 두 개
	// 1) 생성자
	// 2) 메서드


class Scv{
	
	void prt() {
		System.out.println("hello : ");
	}
	
	void prt(int a) {
		System.out.println("hello : " + a);
	}

	void prt(float a) {
		System.out.println("hello : " + a);
	}
	
	void prt(char a) {
		System.out.println("hello : " + a);
	}
	
	void prt(int a , float b) {
		System.out.println("hello : " + a + ": " + b);
	}
	
}

public class How_to_use_Overloading {

	public static void main(String[] args) {
		
		(new Scv()).prt(); (new Scv()).prt(3.0f);
		(new Scv()).prt(2); (new Scv()).prt('a');
		(new Scv()).prt(3, 3.0f);
		
		System.out.println(1);  // println 자체가 Overloading 개념이 적용되어있다
		System.out.println(1.0f);
		System.out.println("betty");
		
	}

}

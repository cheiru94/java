package theory;

//Singleton pattern
class A {

	static A myObj; // 자기가 자신을 자료형으로 가질 수 있다.

	private A() { // 객체는 이렇게 찍지는 못 한다 !

	}

	static A getObject() { // 멤버 메소드를 이용 해서 얻을 수 있다!!

		if (myObj == null)
			return myObj = new A(); // 여기는 내부라서 호출이 가능하다 new A()

		return myObj;
	}

}

class test_Singleton2 {
	public static void main(String[] args) {

		A obj2 = A.getObject();

		A obj3 = A.getObject();

		System.out.println(obj2);
		System.out.println(obj3);

	}
}
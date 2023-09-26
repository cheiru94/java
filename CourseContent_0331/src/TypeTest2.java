
class A {
  A() {
  }
}

class B extends A {  //  B는 A로 부터 상속을 받기 때문에 A가 가지고 있는 것들을 다 볼 수 있다
  B() {             // 반대로  A는 상속을 받고 있지 않기 때문에 B가 가지고 있는 것을 볼 수 없다!
  }
}

public class TypeTest2 {
  public static void main(String[] args) {
    A a = new B();  // 🟡부모 클래스의 참조 변수로 자식 클래스의 객체를 참조 가능!🟡 => 다형성
  }
}

package ANONYMOUS_CLASS;

import INTERFACE.RemoteControl;

public class AnonymousTest {
  public static void main(String[] args) {
    RemoteControl rts1 = new SamsungTv();

    // 무명 클래스로 소니티비 객체를 만들어보자
    RemoteControl rt3 = new RemoteControl() {
      ;

      @Override
      public void turnOn() {
        System.out.println("sony tv를 킨다");
      }

      @Override
      public void turnOff() {
        System.out.println("sony tv를 킨다");
      }
    };
    rt3.turnOn();

    
    /*
      ✏️ Student 클래를 상속받는 무명 클래스를 생성하고 이름을 출력해보시오 

         무명 클래스를 만들 때 ( 아래 부모 클래스 이름은 인터페이스 이름을 포함한 의미 )
         new 부모 클래스이름 ( 부모 클래스의 생성자에게 전달한 인자 리스트) {클래스 정의}

         🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴 시험 🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴
         무명클래스를 만들 때는 제약이 있는데 새로운 생성자를 정의할 수 없다. 

         class GradStudent extends Student { public GradStudent (...){...}}  원래는 이렇게 가능하지만 

         무명 클래스는 생성자를 정의할 수 없다
          왜? 생성자는 클래스 이름과 같아야 하는데, 무명 클래스는 클래스 이름이 없다.
          그렇다고 부모 클래스 이름을 생성자를 만들수도 없다
          public Student() {} ❌❌❌❌❌❌❌❌
         🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴
    */ 
    
    Student st1 = new Student();

    System.out.println("학생 이름 : "+ st1.getName());

  }
}

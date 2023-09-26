package generic;
/*  어떤 클래스를 제네릭 클래스로 설정한다는 것은
 * 클래스 내부에서 사용할 데이터 타입을 미리 정해 놓지 않았다⭐
 * 클래스 내부에서 사용할 데이터 타입을 미리 정해 놓지 않겠다는 의미이고
 * 사용자가 이 클래스의 객체를 생성할 때 , 어떤 타입을 사용할지 결정하도록 하겠다는 의미이다⭐⭐
 * 
 * 즉 사용할 데이터 타입을 파라미터로 받겠다. =>> 타입 파라미터 (Type parameter)
 * 
 * 타입 파라미터는 대문자 한 글자로 표현하는 것이 관례
 */


/* 🟢 T 뿐만 아니라 A B C 등등 이렇게 대문자 1개로만 사용하면 된다 */
public class GenericBox<T> {  // 타입은 지정 안 할란다... 만들고 싶은 놈 니가 알아서 결정해라
  T value;

  public T getValue() {
    return value;
  }
  public void setValue(T value) {
    this.value = value;
  }
}

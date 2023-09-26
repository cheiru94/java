package POLYMORPHISM2;

abstract public class Comparable {
  // 현재가 더 크면 1, anotherVal 하고 값이 같으면 0 , 현재보다 더 작으면 -1
  public abstract int compareTo(Comparable anotherVal);

}

/*
 * 🟢 compareTo() 🟢
 * 인터페이스를 구현한 클래스에서 사용할 수 있는 메서드
 * 이 메서드는 `두 객체를 비교`하여 순서를 결정하는 데 사용
 * 
 *
 * 
 *   예로 A > B 라고 가정하면,

    - A = A  =  0 (동일한 경우) 

    - A > B  =  1 (좌측 값이 큰 경우) 

    - B > A  = -1 (좌측 값이 작은 경우) 
 * 
 * -------------------------------------------------------------------------------------------------------------------
 * Java에서 Comparable은 인터페이스로, 클래스에서 정렬 가능한 객체를 만들기 위해 사용됩니다. Comparable 인터페이스는
 * compareTo() 메서드를 정의하며, 이 메서드는 두 객체를 비교하여 순서를 결정하는 데 사용됩니다.
 * 
 * Comparable 인터페이스를 구현하는 클래스는 다음과 같이 compareTo() 메서드를 오버라이드해야 합니다.
 * 
 
 * public interface Comparable<T> {
 *    public int compareTo(T o);
 * }
 * 
 * 여기서 T는 비교 대상 객체의 타입을 의미합니다. compareTo() 메서드의 구현 방법은 해당 클래스의 특성에 따라 다릅니다.
 * 
 * Comparable 인터페이스를 구현한 클래스는 정렬이 필요한 컬렉션에서 사용할 수 있습니다. 예를 들어, Arrays.sort()나
 * Collections.sort()와 같은 메서드를 사용하여 객체의 배열 또는 리스트를 정렬할 때 사용됩니다.
 * 
 * 
 */
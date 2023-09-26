package theory;

class tank {
	int myId; // 멤버 변수  =>  int 앞에 static 을 붙이면 정적 변수로 전부 1씩 증가 한다

	tank() { // 멤버 메소드 
		myId = myId + 1;

	}
}

public class test_Object {

	public static void main(String[] args) {

		System.out.println((new tank()).myId);
		System.out.println((new tank()).myId);
		System.out.println((new tank()).myId);
		System.out.println((new tank()).myId);
		System.out.println((new tank()).myId);
		// 객체는 전부다 독립적으로 생성이된다 -> 각각의 객체이기 때문에 다 적용되는것도 각각!

	}

}

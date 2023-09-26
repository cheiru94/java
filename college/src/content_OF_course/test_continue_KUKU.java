package content_OF_course;

public class test_continue_KUKU {

	public static void main(String[] args) {

		// 2022.11.16 水

		// continue break
		// continue : 계속하다

// 1.	실행을 멈추고 위로 올라가 첫 번째 만나는 반복문을 찾는다 
// 2. 	계속 반복 실행 
// 특정 조건의 해당문장이 실행 되지 않게 할 때 자주 사용
// continue 아래에 있는 문장을 실행하지 않는다 

// 3, 4, 6, 8 단은 제외

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				if (i == 3 || i == 4 || i == 6 || i == 8)
					continue;
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}

	}

}

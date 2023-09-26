package theory;

public class test_Arraytest_Constant {

	public static void main(String[] args) {

		// 1 ~ 50 사이 정수 중 난수로 10개를 선택하시오

		final int THE_NUM_OF_ELEMENT = 10; // 상수

		int bar[] = new int[THE_NUM_OF_ELEMENT]; // 배열의 크기는 하나의 상수로 관리 한다 !

		// 배열 만드는 반복문
		for (int i = 0; i < 10; i++) {

			bar[i] = (int) (Math.random() * 50) + 1; // 10개 크기의 배열 생성

		}

		// 출력 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + bar[i]);
		}

	}

}

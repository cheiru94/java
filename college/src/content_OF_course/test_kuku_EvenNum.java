package content_OF_course;

public class test_kuku_EvenNum {

	public static void main(String[] args) {
		// < 구구단 출력 >
		// 짝수단 출력 구현 시, “% 연산자를 이용하여 구현 할 것!”

		// 2중 for 문 사용 1.단 2.곱하는 값 (1~9)

		// 1. 단 반복 (2~9) for 문
		for (int dan = 2; dan < 10; ++dan) {

			// 2. 곱하는 값 (1~9) for문
			for (int index = 1; index < 10; ++index) {

				// 조건식 : 짝수단 출력 %
				if (dan % 2 == 0) {
					System.out.print(dan + " X " + index + " = " + dan * index + "\t");

					// 곱하는 값이 %3=0 이면 줄 바꾸기
					if (index % 3 == 0) {
						System.out.println();
					} // 개행
				}

			}
			System.out.println();

		}

	}

}

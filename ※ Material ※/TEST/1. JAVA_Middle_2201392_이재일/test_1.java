package middle_test_package;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {

		/* 압축 할 때 2201392_이재일 로 압축 */

		// 키보드로 부터 입력 값 받기
		Scanner scan = new Scanner(System.in);

		// 1) while 문 - 1000 입력 받을 때 까지
		while (true) {

			int inputValue = scan.nextInt(); // 키보드로 단 입력 받기

			// 2) if문 - 양의 정수인 경우
			if (inputValue > 0) {

				// 2.1) 프로그램 종료
				if (inputValue == 1000) {

					System.out.println("프로그램 종료, 감사합니다"); // ※결과 출력

					break; // => 프로그램 종료 ( while문 탈출)
				}

				// 2.2) 짝수인 경우
				else if (inputValue % 2 == 0) {

					System.out.println("짝수입니다"); // ※결과 출력
				}

				// 2.3) 홀수인 경우
				else {

					System.out.println("홀수입니다"); // ※결과 출력
				}
			}

			// 3) 양의 정수가 아닌 경우
			else {

				// 3.1) 입력 값 "0" 인경우
				if (inputValue == 0) {

					System.out.println("양의 정수를 입력 하세요, 현재 입력 값 0"); // ※결과 출력
				}
				// 3.2) 입력 값 "음수" 인경우
				else if (inputValue < 0) {

					System.out.println("양의 정수를 입력 하세요, 현재 입력 값 음수"); // ※결과 출력
				}
			}

		}

		scan.close(); // ※Scanner 종료※

	}

}

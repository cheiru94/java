package middle_test_package;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {

		/* 압축 할 때 2201392 이재일 로 압축 */

		// 단 입력 받기
		Scanner scan = new Scanner(System.in);

		System.out.println("출력할 구구단의 단을 입력 하세요"); // Massage 출력
		int inputDan = scan.nextInt(); // 키보드로 단 입력 받기

		// N의 for 문 - inputDan * N (반복해서 곱셈 나열 하기)

		// from to variance
		for (int value = 1; value <= 9; value++) {

			// if 문 - 3의 배수는 출력 x
			if (value % 3 != 0) {

				System.out.println(inputDan + "X" + value + "=" + inputDan * value); // ※결과 출력
			}

		}

		scan.close(); // ※Scanner 종료※
	}

}

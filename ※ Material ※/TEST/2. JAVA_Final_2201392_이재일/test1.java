package finalTest;

import java.util.Iterator;

public class test1 {

	public static void main(String[] args) {

		/* test1 - 2201392_이재일 */

		final int FIVE = 5;  // 고정 상수 값 5 지정

		// 1. 기본 세팅
		// 배열
		int bector[] = new int[FIVE];

		// 난수 0 ~ 25 사이의 난수
		int randomNum = (int) (Math.random() * 26);

		// 반복문 2개
		for (int front = 0; front < bector.length; front++) {
			for (int back = 0; back < bector.length; back++) {

				// 조건식
				if (bector[back] == randomNum) {
					randomNum = (int) (Math.random() * 26);
					back = -1;
				}
			}
			// 바로 입력
			bector[front] = randomNum;
		}

		// 2. 최대 , 최소 저장 변수
		int max = bector[0]; // 최대값 변수
		int min = bector[0]; // 최소값 변수
		int sumValue = 0;    // 합계 변수
		// 최대 값 최소 값 비교
		for (int index = 0; index < bector.length; index++) {

			// 최대값 구분
			if (bector[index] > max) {
				max = bector[index];

				// 최솟값 구분
			} else if (bector[index] < min) {
				min = bector[index];
			}

		}

		// 3. 실행 결과 출력부
		System.out.println("선택된 난수는 아래와 같습니다.");

		// 합계 반복문
		for (int index = 0; index < bector.length; index++) {
			sumValue += bector[index];
			System.out.print(bector[index] + " ");
		}

		// 4. 출력 부분
		System.out.println();
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		System.out.println("합계: " + sumValue);

	}

}

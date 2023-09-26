package college_Quize;

import java.util.Scanner;

public class  quiz_6 {

	public static void main(String[] args) {

		// 11.30 水

		// 0~9사이의 3개 정수를 Math.rand() API를 이용하여 난수로 생성.
		// 중복 값 XX

		// 3개의 정수
		final int FIXED_THREE = 3;

		/** 1) ※ 난수 배열 생성 */
		int answer_A[] = new int[FIXED_THREE];

		int random_Count = 0; // 2까지 횟수 세기

		while (true) {

			int ransu = (int) (Math.random() * 10);

			if (ransu != answer_A[0] && ransu != answer_A[1]) {

				answer_A[random_Count] = ransu;

				random_Count += 1;

				if (random_Count > 2) {
					break;
				}
			}
		}

		/** 2) ※ 사용자 입력 값 배열 생성 */
		Scanner scan = new Scanner(System.in);

		// 변수
		int total_Count = 1; // 전체 카운트
		int strike = 0; // Strike
		int ball = 0; // Ball
		int out = 0; // Out

		/** 3) 전체 관리 while문 [처음] */
		while (true) {

			// 시도 횟수 , 정수 출력하라 안내문
			System.out.println("시도횟수 : " + total_Count);
			System.out.println("정수 3개를 입력하세용~~~");

			/** 4) ※ 사용자 입력값 배열 생성 */
			int user_A[] = new int[FIXED_THREE];

			// 사용자로 부터 값 입력 받기 X 3
			for (int index = 0; index < FIXED_THREE; index++) {

				int user_Input = scan.nextInt();

				user_A[index] = user_Input;
			}

			/** 5) answer 배열을 기준으로 user 배열의 요소 값들 하나씩 비교 */
			// 5.1)answer_A 반복문
			for (int index_a = 0; index_a < answer_A.length; index_a++) {

				// 5.2) user_A 반복문
				for (int index_u = 0; index_u < user_A.length; index_u++) {

					/** 5.1.1) STRIKE */
					if (answer_A[index_a] == user_A[index_a]) {
						strike += 1;
						break;
					}

					/** 5.1.2) BALL */
					else if (answer_A[index_a] == user_A[index_u]) {
						ball += 1;
						break;
					}
				}
			}
			/** 5.1.3) OUT */
			if (strike == 0 && ball == 0) {
				out += 1;

			}

			// 현재 상황 출력
			/** Strike */
			if (strike > 0) {
				System.out.print(strike + " Strike" + "\t");
			}
			/* Ball */if (ball > 0) {
				System.out.print(ball + " Ball" + "\t");
			}
			/* Out */ if (out > 0) {
				System.out.print("Out: 아웃 " + out + "번");
			}

			System.out.println(); // 줄 변환

			total_Count += 1; // 사용 횟수 증가

			/** 6) 결과 */
			// 6.1)패배
			if (total_Count >= 5 || out == 2) {
				System.out.println("게임횟수 초과");
				System.out.println("아까비~~~졌네용..");
				System.out.println("정답은 " + answer_A[0] + answer_A[1] + answer_A[2] + " 입니다.");
				System.out.println("계속하려면 아무 키나 누르십시오...");
				break;
			}

			// 6.2)승리
			if (strike >= 3) {
				System.out.println("おめでとうございます！ご勝利になりました！");
				break;
			}

			// 변수 리셋
			strike = 0;
			ball = 0;

		} // 전체 관리 while문 [끝]

	}

}

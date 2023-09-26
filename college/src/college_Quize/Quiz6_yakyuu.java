package college_Quize;

import java.util.Scanner;

public class Quiz6_yakyuu {

	public static void main(String[] args) {
		// 11.30 水

		// 0~9사이의 3개 정수를 Math.rand() API를 이용하여 난수로 생성.
		// 중복 값 XX

		// 3개의 정수
		final int FIXED_THREE = 3;

		/** ※ 난수 배열 생성 */
		int answer_A[] = new int[FIXED_THREE];

		int random_Count = 0; // 2까지 횟수 세기

		while (true) {

			// 랜덤 값 0 ~ 9
			int ransu = (int) (Math.random() * 10);

			if (ransu != answer_A[0] && ransu != answer_A[1]&& ransu != answer_A[2]) {

				answer_A[random_Count] = ransu;

				random_Count += 1;

				if (random_Count > 2) {
					break;
				}
			}
		}

		/** ※ 사용자 입력 값 배열 생성 */
		Scanner scan = new Scanner(System.in);

		int total_Count = 1; // 전체 카운트

		int strike = 0; // Strike
		int ball = 0; // Ball
		int out = 0; // Out

		System.out.println("정답" + "\n" + answer_A[0] + answer_A[1] + answer_A[2]);

///////////////////////////////////////////////////////////////////////////////////////////////////////////

		/** 전체 관리 while문 [처음] */
		while (true) {

			// 시도 횟수 , 정수 출력하라 안내문
			System.out.println("시도횟수 : " + total_Count);
			System.out.println("정수 3개를 입력하세용~~~");

			/** ※ 사용자 입력값 배열 생성 */
			int user_A[] = new int[FIXED_THREE];

			/** 사용자로 부터 값 입력 받기 X 3 */
			for (int index = 0; index < FIXED_THREE; index++) {

				int user_Input = scan.nextInt();
			
				user_A[index] = user_Input;
			}
			// System.out.println("사용자 입력 값" + "\n" + user_A[0] + user_A[1] + user_A[2]);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			

			// for 문 - answer_A
			for (int index_a = 0; index_a < answer_A.length; index_a++) {
				// for 문 - user_A
				for (int index_u = 0; index_u < user_A.length; index_u++) {

					/** STRIKE -> answer_A[index_a] == user_A[index_a] */
					if (answer_A[index_a] == user_A[index_a]) {
						strike += 1;
						break;
					}

					/** BALL */
					else if (answer_A[index_a] == user_A[index_u]) {
						ball += 1;
						break;
					}
				}
			}
			/** OUT */ // 나가리
			if (strike == 0 && ball == 0) {
				out += 1;

			}

			// 현재 상황 출력

			/* strike */ if (strike > 0) {
				System.out.print(strike + " Strike" + "\t");
			}
			/* Ball */if (ball > 0) {
				System.out.print(ball + " Ball" + "\t");
			}
			/* Out */ if (out > 0) {
				System.out.print("Out: 아웃 " + out + "번");
			}
			System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////					
			// 진행 중인 출력 값

			total_Count += 1; // 사용 횟수 증가

			// 敗北の場合
			if (total_Count >= 5 || out == 2) {
				System.out.println("게임횟수 초과");
				System.out.println("아까비~~~졌네용..");
				System.out.println("정답은 " + answer_A[0]+ answer_A[1] + answer_A[2] + " 입니다.");
				System.out.println("계속하려면 아무 키나 누르십시오...");
				break;
			}

			// 勝利の場合

			if (strike >= 3) {
				System.out.println("おめでとうございます！ご勝利になりました！");
				break;
			}

			// 변수 리셋
			strike = 0; // Strike
			ball = 0; // Ball

		} // 전체 관리 while문 [끝]

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}

}

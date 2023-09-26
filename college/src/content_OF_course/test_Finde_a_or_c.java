package content_OF_course;

import java.util.Scanner;

/**
 * Object First input value == 'a' and Second input value == 'c'
 */

public class test_Finde_a_or_c {
	public static void main(String[] args) {
		// 처음 입력 값 : a 그리고 두번 째 입력 값 : c 이면 "참" 을 출력하는 프로그램을 만들라.

		// 첫 번째 입력 값이 a였었고,
		// 두 번째 입력 값이 c 이면 "참" 출력 후 종료
		// 두 번째 입력 값이 c가 아니면, 첫 번째 입력으로 회귀 ★★★★★
		// 둘중 한개라면 틀리면 첫 번째 입력으로 돌아감 ★★★★★

		// 값 입력 받기
		boolean flag = false;

		// 단어 하나로 뽑기
		Scanner scan = new Scanner(System.in);
		// 연속해서 a 다음 c 가 나오도록 무한 반복
		while (true) {

			String words = scan.next();

			char character = words.charAt(0); // 하나의 알파벳 저장

			// 1) 첫번째 character 가 'a' 인지 판별
			if (character == 'a') {
				flag = true;
			}

			// 2) 첫번째가 'a' 고 두번째가 'c'인 경우
			else if (character == 'c' && flag) {

				System.out.println("真であります。");
				System.out.println("ありがとうございました。");
				break;
			}
			// 둘다 아닌경우 pass
			else {
				flag = false;
			}

		}scan.close();
		
	}
}

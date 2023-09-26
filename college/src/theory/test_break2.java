package theory;

import java.util.Scanner;

public class test_break2 {

	public static void main(String[] args) {

		// 2022.11.16 水

		// continue break
		// continue : 계속하다
		// break : 멈추다 , 탈출하다

		// ※ break 문을 만나면 실행흐름을 멈추고 첫 번째 만나는 반복문을 만날 때 까지 위로 올라간다.
		// ※ 만나면 그 반복문을 탈출한다

		// ※※ 조건이 많아지면 while loop 사용 ※※

		Scanner scan = new Scanner(System.in);

		int inputValue = 0;

		while (true) {

			inputValue = scan.nextInt();

			if (inputValue > 0)
				break;

			// 잘못된 입력 값 처리

			String Msg = "잘 못된 입력 값입니다. 현재 값";
			if (inputValue == 0)
				Msg += "0";
			else
				Msg += "음수 입니다.";

			System.err.println("양수만 입력하세요");

		}

		System.out.println(inputValue);

	}

}

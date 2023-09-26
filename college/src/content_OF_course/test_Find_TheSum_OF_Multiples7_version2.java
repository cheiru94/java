package content_OF_course;

import java.util.Scanner;

public class test_Find_TheSum_OF_Multiples7_version2 {

	public static void main(String[] args) {
		// 1~ N 까지 7의 배수의 합을 구하라. 그리고 배수의 합을 구하는중
		// 7누적 값이 처음으로 100 을 넘기는 7의 배수 값을 출력 하시오
		// N 값은 키보드로부터 입력
		// 7의 배수는 누적 값이 100을 넘기지 못하는 경우,
		// "100을 넘기는 7의 배수 값" 문구는 출력하지 마시오
		// 음수 넣으면 처음 출력 문구 다시

		// 입력값 만들기
		Scanner scan = new Scanner(System.in);

		int baesu = 0; // 반복해서 7 의 배수를 담을 변수
		int result =0 ;
		// 전체 적으로 반복 할 while 문 작성
		boolean flag = true;
		while (true) {
			// 출력 문구
			System.out.println("1~ N 까지 7의 배수의 합을 구하기");
			//

			System.out.print("양수 N 값을 입력하시오: ");
			int N = scan.nextInt(); // N이란 입력 값 받기

			// for 반복문 1 ~ N 까지 반복
			for (int Num = 1; Num <= N; ++Num) {

				// if 조건문으로 7의 배수 찾기
				if (Num % 7 == 0) {
					// 7 의 배수이면 basu에 더해서 저장
					baesu += Num;

					// baesu 가 100 을 넘기는 경우 의 NUM 값이 얼마고 ?
					if (baesu >= 100 && flag) {
						result = Num;
						flag = false;
					}
				}
			}
			System.out.println("누적된 합의 값이 처음으로 100을 넘기는 7의 배수는 " + result);
			System.out.println(baesu);
			
		}

	}

}

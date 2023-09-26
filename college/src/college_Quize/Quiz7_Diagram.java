package college_Quize;

import java.util.Scanner;

public class Quiz7_Diagram {

	public static void main(String[] args) {

		/* 문제 */
// 키보드로부터 양의 정수 하나(N)를 입력 받아, N개 크기의 정수형 배열을 선언하고, 
// 선언된 배열 안에 “–50” ~ “50” 사이의 난수로 중복값 없이 채운 후,  
// 최대값,최소값, 평균값을 계산해서 출력하고 각 구간별 난수의 개수를 히스토그램으로 출력하는 
// 프로그램을 작성하라. 	

		// 키보드로 부터 양의 정수(=N)를 입력 받고, N개의 정수형 배열 선언
		// 입력받은 N 값이 1이상 100이하의 값만 수용, 아닐 경우 Msg 출력 후 재입력
		// 난수를 발생하여 배열에 저장
		// 배열 내 중복값 제거
		// 최대값 구하기
		// 최소값 구하기
		// 평균값 구하기, 실수 출력
		// 구간별 난수의 개수를 구하고 히스토그램으로 출력

		Scanner scan = new Scanner(System.in);
		// 사용자로 부터 정수 입력 받기

		// 사용자로 부터 정수 입력 받기
		System.out.println("배열의 개수를 입력하세요.");
		
		int inputNum = scan.nextInt();

		int array[];
		int betty[];
		/* 1 */
		while (true) {

			// 1이상 100이하의 값만 수용
			if (1 <= inputNum && inputNum <= 100) {

				// 배열 선언
				array = new int[inputNum];
				betty = new int[inputNum];
				break;
			} else {
				System.out.println("1이상 100이하의 값만 입력하세요.");
				System.out.println("배열의 개수를 입력하세요.");
				inputNum = scan.nextInt();
			}

		}

		/* 2 */
		// 난수 생성
		int randomNum = (int) (Math.random() * 101 - 50);

		// 난수를 범위가 정해진 배열안에 넣기 (중복 값 없이)
		for (int front = 0; front < array.length; front++) {
			for (int back = 0; back < front; back++) {

				if (randomNum == array[back]) {
					randomNum = (int) (Math.random() * 101 - 50);
					back = -1;
				}
			}
			array[front] = randomNum;
			betty[front] = randomNum;
		}

		/* 3 */
		// 최대값 ,최소값, 평균
		int container = 0; // = C

		// 기준점
		for (int front = 0; front < array.length; front++) {
			// 비교 대상
			for (int back = 0; back < array.length; back++) {

				// 앞의 숫자가 더 큰 경우
				if (array[front] > array[back]) {

					// A -> C
					container = array[front];
					// B -> A
					array[front] = array[back];
					// C -> B
					array[back] = container;
				}
			}
		}

		/* 4 */
		// 출력부분

		int daiagram_array[] = new int[10];

		// 평균
		double sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];

			if (-50 <= array[index] && array[index] <= -41) {
				daiagram_array[0] += 1;
			} else if (-40 <= array[index] && array[index] <= -31) {
				daiagram_array[1] += 1;
			} else if (-30 <= array[index] && array[index] <= -21) {
				daiagram_array[2] += 1;
			} else if (-20 <= array[index] && array[index] <= -11) {
				daiagram_array[3] += 1;
			} else if (-10 <= array[index] && array[index] <= -1) {
				daiagram_array[4] += 1;
			} else if (0 <= array[index] && array[index] <= 9) {
				daiagram_array[5] += 1;
			} else if (10 <= array[index] && array[index] <= 19) {
				daiagram_array[6] += 1;
			} else if (20 <= array[index] && array[index] <= 29) {
				daiagram_array[7] += 1;
			} else if (30 <= array[index] && array[index] <= 39) {
				daiagram_array[8] += 1;
			} else if (40 <= array[index] && array[index] <= 50) {
				daiagram_array[9] += 1;
			}
		}
		System.out.println();
		System.out.println("배열의 개수 : " + array.length);
		System.out.print("배열 내 난수값 : ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
			if (i == array.length - 1) {
				System.out.println(betty[i]);
			}
		}

		// 최대 최소 평균
		System.out.println("최\t대\t값 : " + array[0]); // 최대
		System.out.println("최\t대\t값 : " + array[array.length - 1]); // 최소
		System.out.println("평\t균\t값 : " + sum / (double) array.length);

		/* 5 */
		// 히스토그램
		System.out.println();
		System.out.println("히스토그램");
		System.out.print("-50 ~ -41 : ");
		for (int i = 0; i < daiagram_array[0]; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("-40 ~ -31 : ");
		for (int i = 0; i < daiagram_array[1]; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		System.out.print("-30 ~ -21 : ");
		for (int i = 0; i < daiagram_array[2]; i++) {
			System.out.print("*");

		}
		System.out.println();
		System.out.print("-20 ~ -10 : ");
		for (int i = 0; i < daiagram_array[3]; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("-10 ~ -1 : ");
		for (int i = 0; i < daiagram_array[4]; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("0 ~ 9 : ");
		for (int i = 0; i < daiagram_array[5]; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("10 ~ 19 : ");
		for (int i = 0; i < daiagram_array[6]; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("20 ~ 29 : ");
		for (int i = 0; i < daiagram_array[7]; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("30 ~ 39 : ");
		for (int i = 0; i < daiagram_array[8]; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("40 ~ 50 : ");
		for (int i = 0; i < daiagram_array[9]; i++) {
			System.out.print("*");
		}
		scan.close();

	}

}

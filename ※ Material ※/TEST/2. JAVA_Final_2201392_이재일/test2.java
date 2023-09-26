package finalTest;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		/* test2 - 2201392_이재일 */

		Scanner scan = new Scanner(System.in);

		// 출력문
		System.out.println("M X R X C 값을 입력하세요");
		// 사용자로 부터 M , R , C 값 입력 받기
		int m = scan.nextInt();
		int n = scan.nextInt();
		int c = scan.nextInt();
		
		// 입력 받은 M , R , C 값으로 부터 배열 생성
		int matrix[][][] = new int[m][n][c];
		
		
		// 선택 번호 지정 까지는 누르기까지 무한 반복문
		while (true) {


			// 메뉴 출력부분
			System.out.println("메뉴를 선택 해주세요");
			System.out.println("1. 해당 배열 원소에 정수값 입력");
			System.out.println("2. 해당 배열 원소  정수값 출력");
			System.out.println("3. 모든 배열 원소 값 출력");
			System.out.println("4. 프로그램 종료");

			// 메뉴 선택 번호
			int select_Num = scan.nextInt();

			// 1. 해당 배열 원소에 정수값 입력
			if (select_Num == 1) {

				System.out.println("배열 원소 내 정수값 저장!!!");
				System.out.println("M X R X C 값을 입력하세요");

				// 사용자로 부터 M , R , C 값 입력 받기
				int m2 = scan.nextInt();
				int n2 = scan.nextInt();
				int c2 = scan.nextInt();

				System.out.println("해당 배열 원소에 저장할 정수 값을 입력하세요");

				int inputNum = scan.nextInt();

				matrix[m2][n2][c2] = inputNum;
			}
			
			// 2. 해당 배열 원소 정수값 출력

			else if (select_Num == 2) {
				System.out.println("배열 원소 내 정수값 출력!!!");
				System.out.println("M X R X C 값을 입력하세요");
				int m3 = scan.nextInt();
				int n3 = scan.nextInt();
				int c3 = scan.nextInt();
				
				System.out.println("["+m3 +"]"+"["+n3 +"]"+"["+c3 +"]"+"배열 원소 값은" + matrix[m3][n3][c3]+"입니다");
				
			}
			
			// 3. 모든 배열 원소 값 출력

			// 차원
			else if (select_Num == 3) {
				for (int demension = 0; demension < matrix.length; demension++) {

					// 횟수 출력문
					System.out.println(demension + 1 + "번 Matrix");

					// row
					for (int row = 0; row < n; row++) {
						// column
						for (int column = 0; column < c; column++) {

							System.out.print(matrix[demension][row][column] + "\t");
						}
						System.out.println();
					}
					System.out.println("====================");
				}
			}

			// 4. 프로그램 종료
			if (select_Num == 4) {
				System.out.println("프로그램 종료");
				break;

			}
//			

		} // blace of while

/////////////////////////////////////////////////////////////////////////////////////////////		

	}
}

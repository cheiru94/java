package college_Quize;

import java.util.Arrays;

public class Quiz8_Matrix {

	public static void main(String[] args) {
		// 1 ~ 50 사이의 중복되지 않는 랜덤 값 25개 선택 , 2차원 배열에 저장
		// 각 열, 행 별 최대, 최소, 중간 값을 찾아 출력하라.

		final int FIVE = 5;
		// 크기가 25개인 배열 생성
		int vector[] = new int[FIVE * FIVE];

		/* 1 */
		// 중복하지 않는 수 메트릭스에 담기
		int ransuu = (int) (Math.random() * 50 + 1); // 1~50 랜덤수

		for (int row = 0; row < vector.length; row++) {
			for (int column = 0; column < row; column++) {
				if (vector[column] == ransuu) {
					ransuu = (int) (Math.random() * 50 + 1);
					column = -1;
				}
			}
			vector[row] = ransuu;
		}
		Arrays.sort(vector); // 정렬

		/* 2 */
		// 2차원 배열 생성
		int matrix[][] = new int[FIVE][FIVE];

		int count = 0;
		for (int row = 0; row < FIVE; row++) {
			for (int column = 0; column < FIVE; column++) {
				matrix[row][column] = vector[count];
				count += 1;
			}
		}

		/* 3 */
		// 출력
		// 전체 메트릭스 표시
		System.out.println("メトリクス");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		// 1. 열
		System.out.println();
		System.out.println("열");
		// 최소
		System.out.print("최소값\t");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				if (row == 0) {
					System.out.print(matrix[row][column] + "\t");
				}
			}
		}

		// 최대
		System.out.println();
		System.out.print("최대값\t");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				if (row == matrix.length - 1) {
					System.out.print(matrix[row][column] + "\t");
				}
			}
		}

		// 중간
		System.out.println();
		System.out.print("중간값\t");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				if (row == matrix.length / 2) {
					System.out.print(matrix[row][column] + "\t");
				}
			}
		}

		System.out.println();

		// 2. 행

		System.out.println();
		System.out.print("최소갑\t최대갑\t중간값\n ");
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				if (column == 0 || column == 2 || column == 4) {
					System.out.println(matrix[row][0] + "\t" + matrix[row][2] + "\t" + matrix[row][4]);
					break;
				}
			}
		}

		// 3. 전체
		System.out.println();
		System.out.println("\n전체");
		System.out.println("최소값\t" + matrix[0][0]);
		System.out.println("최대 값\t" + matrix[4][4]);
		System.out.println("최소값\t" + matrix[2][2]);

	}

}

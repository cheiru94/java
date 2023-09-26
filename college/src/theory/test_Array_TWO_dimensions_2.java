package theory;

public class test_Array_TWO_dimensions_2 {

	public static void main(String[] args) {

		int bar[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		/*
		 * 1 | 2 | 3 
		 * ----------
		 * 4 | 5 | 6
		 */

		/* 행 */
		for (int index = 0; index < bar.length; index++) {

			/* 열 */
			for (int j = 0; j < bar[index].length; j++) {
				System.out.print(bar[index][j] + "\t");
			}
			System.out.println();

		}

	}

}

package playing;

import java.util.Scanner;

public class Blank_Star {

	public static void main(String[] args) {
		/*
		 
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("몇층 하고 싶노?");

		int floor = scan.nextInt();

		// 1) 전체 층 from to variance
		for (int floor_point = 0; floor_point < floor; floor_point++) {

			// 공백 from to variance
			for (int blank_point = 0; blank_point < floor - floor_point - 1; blank_point++) {
				System.out.print(" ");
			}

			// 별 from to variance => 2x(해당층)+1
			for (int star_ponint = 0; star_ponint < 2 * floor_point + 1; star_ponint++) {

				// 1.1) 조건식 => 처음 과 끝 출력

				if (floor_point + 1 == floor) {
					System.out.print("*");
				}

				else if (star_ponint == 0 || star_ponint == 2 * floor_point) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
				// 1.2) 조건식 => 제일 마지막층은 그냥 출력

			}

			// line alignment
			System.out.println();
		}

		scan.close();

	}

}

package theory;

import java.util.Scanner;

public class test_switch_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("성적을 입력해 주세요");
		int score = scan.nextInt();

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("Fuck you");
		}
		scan.close();
	}

}

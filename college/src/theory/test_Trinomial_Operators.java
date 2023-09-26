package theory;

import java.util.Scanner;

public class test_Trinomial_Operators {

	public static void main(String[] args) {
		// 입력 받기 위한 객체 선언
		Scanner scan = new Scanner(System.in);

		// 정수를 입력 받아 아래와 같이 출력하는 프로그램 작성
		System.out.println("what is your sex?");

		
		int sex = scan.nextInt(); // 무슨 값이 들어올 줄 모르는데 int로

		// 판별
		// 삼항연산자를 사용하여 if - else 문 대신 간단하게 표현할 수 있다.
		System.out.println(sex == 1 ? "Male" : "Female");

		scan.close();
		
		// <삼항연산자 쓰지 않았을 때>
		/*
		// 입력 받기 위한 객체 선언
		Scanner scn = new Scanner(System.in);

		// 정수를 입력 받아 아래와 같이 출력하는 프로그램 작성
		System.out.println("what is your sex?");

		String printMsg;
		int sex = scn.nextInt();

		// 판별
		if (sex == 1) { // 남자
			printMsg = "Male";
		} else if (sex == 2) { // 여자
			printMsg = "Female";
		} else { // 그 외
			printMsg = "잘못된 입력 값.";
		}

		System.out.println(printMsg);
										*/
	}

}

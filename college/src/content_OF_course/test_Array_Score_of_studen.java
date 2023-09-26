package content_OF_course;

import java.util.Scanner;

public class test_Array_Score_of_studen {

	public static void main(String[] args) {
		// 학생 4명에대한 평균 점수를 구하라

		// 총 학생 수
		final double ZINNIN = 4;

		Scanner scan = new Scanner(System.in); // 성적 입력 받기

		int[] score = new int[4]; // 성적 담는 배열 선언 + 생성

		double sum = 0; // 합계 변수

		// 배열에 순차적으로 성적 담을 for 반복문
		for (int i = 0; i < score.length; i++) {

			System.out.println((i + 1) + "번째 성적을 입력하시오");

			int student = scan.nextInt(); // 성적 입력 받기

			score[i] = student; // 배열에 성적 저장
		}

		// 배열로 입력 받은 성적을 다 더하는 for 반복문
		for (int i = 0; i < ZINNIN; i++) {
			sum += score[i];
		}

		double result_avg = sum / ZINNIN; // 평균 계산

		System.out.println(result_avg); // 결과값 
		
		scan.close();

	}

}

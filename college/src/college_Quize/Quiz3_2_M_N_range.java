package college_Quize;

import java.util.Scanner;

public class Quiz3_2_M_N_range {

	public static void main(String[] args) {
		
/*		2. 키보드로부터 정수 2개를 입력 받아, M~N 사이의 정수를 출력하라 
		 2.1 M < N 일 경우 M에서 N까지 정수 출력 
		 2.2 M > N 일 경우 N에서 M까지 정수 출력 
		 2.3 M == N 일 경우 입력 값 출력 
		 2.4 출력 포맷은 아래와 반드시 동일, [정수 자리 구분“,” 출력]  */

		//  정수 입력 받기
		Scanner scan = new Scanner(System.in);
		
		// 입력 출력문
		System.out.println("Mをご記入下さい。");
		int M = scan.nextInt();
		System.out.println("Nをご記入下さい。");
		int N = scan.nextInt();
		
		// 1. M N 크기 비교
		if (M != N) {
			
			// 1.1 M < N
			if (M < N) {
				System.out.println("M : "+M+" ~ "+ "N : "+ N +"間の正数は");
				
				// M ~ N 사이의 정수를 순서대로 나열 => 반복문
				for (int i = M; i <= N; i++) {
					
					System.out.print(i);
					if (i!=N) {
						System.out.print(", ");
					}else {
						System.out.println();
					}
				}
			}
				
			// 1.2 M > N
			else if (M > N) {
				
				// N ~ M 사이의 정수를 순서대로 나열 => 반복문
				System.out.println("N : "+N+" ~ "+ "M : "+ M +"間の正数は");
				
				for (int i = M; i >= N; i--) {
					
					System.out.print(i);
					if (i!=N) {
						System.out.print(", ");
					}else {
						System.out.println();
					}
				}
			}
			
		// 2. . M = N
		} else {
			System.out.println("N, Mの正数は : "+ M);
		}	
		
		// 종료 출력문 
		System.out.println("------ご利用いただきありがとうございます------");
		scan.close();
	}
}

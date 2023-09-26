package college_Quize;

import java.util.Scanner;

public class Quiz1_KUKU {

	public static void main(String[] args) {
		
		//   구구단 출력 프로그램 // 
		
		
		boolean flag = true; 
		Scanner scan = new Scanner(System.in); // ★반복문 밖에 두는 것이 좋다★
		// 1. 프로그램 종료 까지 무한 반복 while 문 
		while (flag) {
			
			// 2. 메뉴출력
			System.out.println("------------------------------------");
			System.out.println("1.九九の出力");
			System.out.println("2.プログラムの終了");
			System.out.println("------------------------------------");
		
			// 3.사용자로 부터 값 입력 받기
			int InputNum = scan.nextInt(); // 입력 받은 값을 InputNum 라는 변수에 저장
			
			
			// 4.조건식 1번 or 2번
				// 4.1 - 1번 선택 [프로그램 실행] //  	if (InputNum == 1) 
				if (InputNum == 1) {
					
// 					※※※※※※※※※※※※   구구단 출력   ※※※※※※※※※※※※ 
					System.out.println("出力する九九の段をご記入ください。ただし段は２~９までの整数であります。");
					
					// 2~9 사이의 숫자가 아니면 무한 반복
					while (true) {
						
						int dan = scan.nextInt(); // 단 입력 받기 
						
						// 4.1.1 - 단이 2~9 숫자가 들어 왔을 경우
						if (dan>=2 && dan<=9) {
							// 1 ~ 9 까지 반복해서 곱하기
							for (int icount = 1; icount <= 9; icount++) {
								System.out.println(dan + " X " + icount + "= " + dan*icount);
							}
							break;
						// 4.1.2 - 단이 2~9 이외의 숫자가 들어 왔을 경우	
						}else {
							System.out.println("2~9までの整数をご記入ください。");
						}
					}
						
				// 4.2 2번 선택 [프로그램 종료] //  	(InputNum != 1) 
				} else if (InputNum == 2) {
					System.out.println("ご利用いただきありがとうございます。");
					flag = false;
					
				// 4.3  1번 또는 2번 이외의 숫자를 입력한 경우	
				}else {
					System.out.println("１又は２の中でご記入ください");
				}
		}
		// scan(Scanner 타입) 종료하기
		scan.close();
// ---------------------------  while文 ------------------------------------
	}

}

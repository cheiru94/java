package college_Quize;

import java.util.Scanner;

public class Quiz2_OddEven {

	public static void main(String[] args) {
		
		// 키보드로부터 1이상의 값만 입력, 0 이하의 값 입력시 MSG 출력 후 재입력 
		// "1以上の正数をご記入ください。"    正数 정수　負数 음수
		
		// 키보드로 부터 값을 입력 받기 
		Scanner scan = new Scanner(System.in);
		
		int Counter = 0;
		
		// 20000이 나올 때 까지 반복할 while文 작성
		while (true) {
			
			Counter += 1; // 1씩 증가 
			
			
			String InputValue = scan.next();	//사용자로 부터 입력 받기
			
//			※ 프로그램 종료			
			if (InputValue.equals("20000") || InputValue.equals("q") ) {
				System.out.println("ご利用いただきありがとうございます。");
			}
			
//			※※ "1 이상"의 값
			else if (Integer.parseInt(InputValue)>=1) {
				
				// 「 출력문 」 "N 번째 입력 값은 = ?" 
				System.out.println(Counter + "回目の入力値は = " + InputValue );
				
				// 짝수
				if (Integer.parseInt(InputValue)%2==0) {
					System.out.println("\t偶数です。");
					
				// 홀수
				}else{
					System.out.println("\t奇数です。");
					
				}
			//3의 배수
			if (Integer.parseInt(InputValue)%3==0) {
				System.out.println("\t3の倍数。");
			}
			
			//7의 배수
			if (Integer.parseInt(InputValue)%7==0) {
				System.out.println("\t7の倍数。");
			}
			
//			※※※ "0 이하"의 값   => "1以上の正数をご記入ください。" 출력
			} else {
				System.out.println("1以上の正数をご記入ください。");
			}
			
			
			scan.close();
/*while*/}
		
//------------------------------- 주현이 소스 코드 -------------------------------		
/*		int count = 1;

        Scanner scn = new Scanner(System.in);

        while (true) {
            String userInput = scn.next();

            // Exit Program
            if (userInput.equals("q") || userInput.equals("20000")) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }

            // Type conversion
            int value;
            try {
                value = Integer.parseInt(userInput);
            } catch (Exception e) {
                System.out.println("양식 에러!");
                continue;
            }

            // User out of range
            if (value < 1) {
                System.out.println("1이상 양수를 입력하세요");
                continue;
            }

            // Organize Result
            String result = count + "번째 입력 값은 = " + userInput;
            result += (value % 2 == 0) ? "\n\t짝수입니다." : "\n\t홀수입니다.";

            if (value % 3 == 0) {
                result += "\n\t3의 배수입니다.";
            }
            if (value % 7 == 0) {
                result += "\n\t7의 배수입니다.";
            }
            System.out.println(result);

            count++;
        }  */
//------------------------------- 주현이 소스 코드 -------------------------------		
		
		
		
		
		
		
//---------------------------------------------------------------------------		
	}// 메서드
}// 클래스

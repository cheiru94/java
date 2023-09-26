package hongong_Java;

import java.util.Scanner;

public class book_96p__String_Stop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String inputvalue;

		
		while (true) {
			
			System.out.print("글자를 입력하세요 : ");
			inputvalue = scan.nextLine();

//		기본 타입이 동일한지 비교할 때  == 사용
//      문자열(String)이 동일한지 비교 할 떄는 equals() 매소드 사용
			
			if (inputvalue.equals("betty")) {
				System.out.println("종료");
				break;
			}
		scan.close();	
		}
//-----------------------------------------------------------
		
	}
}

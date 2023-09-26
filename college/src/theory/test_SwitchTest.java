package theory;

import java.util.Scanner;

public class test_SwitchTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~3까지의 번호를 선택해 주세요.");
		int inputNum = scan.nextInt();
		
		switch (inputNum) {
		case 1:
				System.out.println(1);
			break;
		
		case 2:
			System.out.println(2);
			break;
		case 3:	
			System.out.println(3);
			break;
			
			
		default:
			System.out.println("선택 사항이 없습니당....");
			break;
		}
		
	}

}
